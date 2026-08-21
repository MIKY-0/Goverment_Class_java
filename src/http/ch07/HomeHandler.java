package http.ch07;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import jdk.jfr.ContentType;

import java.io.IOException;

/**
 * GET 요청 처리
 * -- 만드는 규칙 --
 * 1. HttpHandler 인터페이스 구현.
 * 2. handler (HttpExchange) 메서드 하나 재정의.
 * 3. main에서 createContext로 경로를 짝지어 등록.
 */

public class HomeHandler implements HttpHandler {
    private static final String HOME_PAGE = """
            <!doctype html>
            <html lang="ko">
              <head>
                <meta charset="UTF-8" />
                <meta name="viewport" content="width=device-width, initial-scale=1.0" />
                <title>나의 HTTP 서버</title>
              </head>
              <body>
                <h1 style="color : red">내가 자바로 만든 순수 HTTP 서버</h1>
                <ul>
                  <li><a href="/health">서버 상태 확인</a></li>
                  <li><a href="/api/users">사용자 목록(json)</a></li>
                </ul>
              </body>
            </html>
            
            """;

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
        String path = exchange.getRequestURI().getPath();

        if(!path.equals("/")) { // 요청 실패시
            SimpleHttpServer.sendResponse(exchange , 404 ,
            SimpleHttpServer.TYPE_TEXT , "404 NOT FOUND : " + path);
            return;
            }

        // Content-Type을 text/html로 보내야 브라우저가 HTML로 해석.

            // 요청 성공시.
        SimpleHttpServer.sendResponse(exchange , 200 , SimpleHttpServer.TYPE_HTML, HOME_PAGE);

        // MIME-TYPE : HTML 문자가 깨져서 보임.   --> text/plain
//        SimpleHttpServer.sendResponse(exchange , 200 , "text/plain" , HOME_PAGE);

        // MIME-TYPE : UTF-8 -> 안꺠짐.
//        SimpleHttpServer.sendResponse(exchange , 200 , "text/plain; charset=UTF-8" , HOME_PAGE);

        }finally {
            exchange.close();
        }
    }
}
