package http.ch04;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.List;
import java.util.stream.Collectors;

// https://jsonplaceholder.typicode.com/users
public class UserListClient {
    public static void main(String[] args) {
        String urlString = "https://jsonplaceholder.typicode.com/users";
        HttpURLConnection conn = null;

        try {
            URL url = URI.create(urlString).toURL();

            conn = (HttpURLConnection) url.openConnection();

            int res = conn.getResponseCode();

            if(res != 200) {
                System.out.println("요청 실패");
                return;
            }

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()))) {
                StringBuilder sb = new StringBuilder();
                String line;

                while( (line = reader.readLine()) != null) {
                    sb.append(line);
                }

            Gson gson = new Gson();

            TypeToken<List<User>> userList = new TypeToken<>(){};
            List<User> users = gson.fromJson(sb.toString() , userList.getType());

            // 3명만 출력.
                List<User> lists = users.stream()
                        .limit(3)
                        .collect(Collectors.toList());

                System.out.println("요청 성공 (상태코드) : " + res);
                System.out.println(lists);

            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
