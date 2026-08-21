package http.ch07;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

/**
 * 핸들러란
 * 핸들러는 처리하는 쪽이라는 뜻.
 * 프로그래밍에서 어떤일이 일어났을때 실행될 코드를 가리킬때 씀.
 */

public class HealthHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            // 1. 보낼 내용 준비.
            String bodyText = "OK";
            SimpleHttpServer.sendResponse(exchange , 200 , SimpleHttpServer.TYPE_HTML , "OK");
            } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            exchange.close();
        }

    }
}
