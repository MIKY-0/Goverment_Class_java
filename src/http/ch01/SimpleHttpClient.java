package http.ch01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

// 이 파일에서 http 통신으로 접근할 서버 주소
// https://jsonplaceholder.typicode.com <-- http 서버 주소.    /todos/1  <-- 엔드포인트
// https://jsonplaceholder.typicode.com/todos/1 : 요청 완성주소.
public class SimpleHttpClient {
    public static void main(String[] args) {
        String baseURL = "https://jsonplaceholder.typicode.com";
        String urlString =  baseURL + "/todos/2";
        HttpURLConnection connection = null;

        // 1단계 : URI로 파싱한뒤 URL 객체로 변환.
        try {
            URI uri = URI.create(urlString);
            URL url = uri.toURL();

            // 2단계 : 연결 객체생성(아직 연결되지 않음)
            connection = (HttpURLConnection) url.openConnection();

            // 3단계 : 요청방식 설정(Method등 설정)
            // GET요청은 HTTP 요청메시지 HTTP 바디영역 없음.
            connection.setRequestMethod("GET");

            // 추가 설정도 세팅 가능.
            connection.setRequestProperty("Accept" , "application/json"); // --> json형식으로 보내겠다.

            // 4단계 : 이 시점에서 실제로 tcp연결 + 요청이 일어나고 서버의 응답 받음.
            int resCode = connection.getResponseCode();
            System.out.println("응답코드(http 상태코드) : " + resCode)  ;

            // 방어적 코드.
            if(resCode != 200) {
                // 실패 응답의 본문을 getInputStream()이 아니라 getErrorStream()으로 읽어야 함.
                System.out.println("요청 실패!");
                return;
            }

            // 5단계 : 응답본문(HTTP 응답 메세지 바디부분) 읽기.
            // I/O에서 배운 그대로 데이터 추출. + 보조스트림(버퍼스트림 활용)
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
              StringBuilder res = new StringBuilder();
              String line;
              while( (line = reader.readLine()) != null ) {
                  res.append(line).append("\n");
              }
                System.out.println("응답 내용 : ");
                System.out.println(res);
            }



        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            // 6단계 : 연결 종료.
            // HttpURLConnection : 옛날에 만든 녀석이라 try-with-resources 못씀.
            // 문법적으로 인터페이스 Closeable 구현하지 않아서 사용 X.
            if(connection != null) {
                connection.disconnect();
            }
        }
    }
}
