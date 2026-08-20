package http.ch04;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

// https://jsonplaceholder.typicode.com/users/1
public class UserClient {

    public static void main(String[] args) {
        String urlString = "https://jsonplaceholder.typicode.com/users/1";
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

                User user = gson.fromJson(sb.toString() , User.class);

                System.out.println("요청 성공 (상태코드) : " + res);
                System.out.println(user);


            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
