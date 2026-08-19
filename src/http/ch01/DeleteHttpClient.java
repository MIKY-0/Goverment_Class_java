package http.ch01;

import javax.net.ssl.HttpsURLConnection;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

public class DeleteHttpClient {
    public static void main(String[] args) {
        String baseURL = "https://jsonplaceholder.typicode.com";
        String urlString = baseURL + "/posts/1";
        HttpURLConnection connection = null;

        try {
            URI uri = URI.create(urlString);
            URL url = uri.toURL();

            connection = (HttpsURLConnection)url.openConnection();

            connection.setRequestMethod("DELETE");

            int resCode = connection.getResponseCode();

            System.out.println("1번 게시글 삭제 완료 (HTTP 상태코드) : " + resCode);

            try (BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                StringBuilder res = new StringBuilder();
                String line;
                while( (line = reader.readLine()) != null) {
                    res.append(line).append("\n");
                }
                System.out.println("삭제요청 응답 메세지(delete요청은 응답바디 없음) : " + res);
            }

        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
