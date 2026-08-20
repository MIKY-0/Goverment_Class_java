package http.ch03;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

public class TodoListClient {
    public static void main(String[] args) {
        // Http 통신을 활용한 단건 조회.
        String urlString = "https://jsonplaceholder.typicode.com/todos";
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

                // Json Array형태 파싱처리.
                // 1. 타입지정 : fromJson(문자열 , 변환타입)
                TypeToken<List< Todo >> typeToken = new TypeToken<List<Todo>>(){};

                // 2. 설계된 타입에 실제 파싱처리.
                List<Todo> todoList = gson.fromJson(sb.toString() , typeToken.getType());

                System.out.println("전체 개수 : " + todoList.size());
                System.out.println("====================================================");

                // 반복 활용 상위3개만 출력.
                for(int i = 0; i < 3; i++) {
                    System.out.println(todoList.get(i));
                }

                List<Todo> lists = todoList.stream()
                        .limit(3)
                        .collect(Collectors.toList());
                System.out.println(lists);
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
