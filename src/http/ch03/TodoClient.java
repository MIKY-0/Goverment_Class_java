package http.ch03;

import com.google.gson.Gson;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

public class TodoClient {
    public static void main(String[] args) {
        // Http 통신을 활용한 단건 조회.
        String urlString = "https://jsonplaceholder.typicode.com/todos/1";
        HttpsURLConnection conn = null;

        try {
            URL url = URI.create(urlString).toURL();
            conn = (HttpsURLConnection) url.openConnection();

            // Http 프로토콜 설정.
            conn.setRequestMethod("GET");

            int res = conn.getResponseCode();
            System.out.println("응답코드 : " + res);

            if(res != 200) {
                System.out.println("요청 실패");
                return;
            }

            //응답 본문 읽자.(메세지 바디영역)
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                StringBuilder sb = new StringBuilder();
                String line;
                while( (line = reader.readLine()) != null) {
                    sb.append(line);
                }

                // GSON 라이브러리 활용.
                Gson gson = new Gson();

                // fromJson(json문자열 , 변환할 클래스)
                Todo todo = gson.fromJson(sb.toString() , Todo.class);
                System.out.println("파싱 결과");
                System.out.println(todo.getUserId());
                System.out.println(todo.getId());
                System.out.println(todo.getTitle());
                System.out.println(todo.isCompleted());

                System.out.println(todo.toString());

            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            if(conn != null) {
                conn.disconnect();
            }
        }


    }
}
