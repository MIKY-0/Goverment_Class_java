package http.ch07;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.time.LocalDateTime;

public class TimeHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        LocalDateTime now = LocalDateTime.now();

        try {
            Time time = new Time(now.toString());
            SimpleHttpServer.sendJson(exchange , 200 , time);

            } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            exchange.close();
        }

    }
}
