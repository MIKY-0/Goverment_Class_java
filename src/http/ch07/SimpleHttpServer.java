package http.ch07;

import com.google.gson.Gson;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * 순수 자바언어로 만드는 HTTP 서버
 * 등장 클래스
 * HttpServer : 포트를 열고 연결을 받는것을 담당.
 * HttpHandler : 특정 경로의 처리로직을 담당.
 * HttpExchange : 요청 하나의 내용과 응답처리를 담당하는 클래스.
 * 요청이 들어올 때마다 서버가 새로 만들어 handler()에 넘겨주고 끝나 버림.
 * Socket VS  HttpExchange
 * --------------------------
 * getInputStream() | getRequestBody()
 * getOutputStream() | getResponseBody()
 *  직접 파싱해야했음 | getRequestMethod()
 *  직접 파싱해야했음  | getRequestURI()
 *  즉, 소켓은 바이트가 왔다까지만 알려주고
 *  HttpExchange 그 바이트를 Http규칙대로 해석해 둔 결과까지 들고왔음.
 */
public class SimpleHttpServer {
    private static final int PORT = 8080;
    private static final int THREAD_POOL_SIZE = 10; // 미리 생성해두는 쓰레드 개수를 의미.
    static final String TYPE_HTML = "text/html; charset=UTF-8";
    static final String TYPE_TEXT = "text/plain; charset=UTF-8";
    static final String TYPE_JSON = "application/json; charset=UTF-8";


    public static void main(String[] args) throws IOException {
        /**
         * 지금까지 쓰던 ServerSocket(8080) 과 같은 일을 함.
         * HttpServer.create(new InetSocketAddress(PORT) , 0) 호출 시 --->
         * '둘다 이 포트로 들어오는 연결을 내가 받겠다.' 라고 운영체제에게 등록하는 일.
         * 차이점은 받는 바이트를 누가 해석하느냐의 차이.
         *
         * * * * * * * HttpServer.create()의 인자 * * * * * * * *
         * 첫번째 인자 : InetSocketAddress = 주소 + 포트
         * new InetSocketAddress("127.0.0.1" , 8080) 그 주소(루프백주소)로 들어온 요청만 받는다.
         * 아래코드에선 생략했는데 생략하면 모든 외부에서 받겠다.
         *
         * 두번째 인자 : 블로킹 , 대기 큐 크기
         * 서버가 아직 처리하지 못한 연결이 줄 서서 기다리는 자리수.
         * 0이나 음수를 주면 현재 코드에서는 아마 내부적으로 50으로 바꿔서 처리함. --> 웨이팅 자리수.
         */
        // 1. Http 서버 객체 생성.
        HttpServer server = HttpServer.create(new InetSocketAddress(PORT), 0);

        // 2. 경로와 담당 핸들러 연결.
        // /signup <- 이러한 (약속)경로가 들어오면 어떤 메서드(핸들러) / 객체 를 실행하라고 미리 정의하는것이 필요.
        // 등록 순서는 상관 없음. 요청이 오면 가장 길게 일치하는 경로가 선정됨.
        // 즉, /api/users 요청이 들어오면 "/"와 "/api/users" 둘다 읽지만 더 긴 경로를 본다.

        // http://localhost:8080
        server.createContext("/" , new HomeHandler());

        // 접근 경로 예시) http://localhost:8080/health.  /health  들어오면 HealthHandler 객체가 일함.
        server.createContext("/health", new HealthHandler());

        // http://localhost:8080/api/users
        server.createContext("/api/users" , new UserApiHandler());

        // http://localhost:8080/api/time
        server.createContext("/api/time" , new TimeHandler());

        // 3. 요청을 처리할 스레드 풀 지정.(http 서버는 멀티스레드 프로그램이라서 미리 생성할 스레드를 지정.)
        server.setExecutor(Executors.newFixedThreadPool(THREAD_POOL_SIZE));

        // 4. 서버 시작 (main은 여기서 끝나고 서버는 별도 스레드에서 계속 돈다.)
        // main이 끝나도 종료되지 않는 이유는 HttpServer가 만든 쓰레드가 살아있기 때문.
        // 멈추려면 종료버튼.
        server.start();
        System.out.println(">> HTTP 서버 시작 <<");

    }

    /*
    공통 메서드 정의 (HealthHandler의 메서드 - 응답을 내보내는 역할.)
     */
    static void sendResponse(HttpExchange exchange, int statusCode, String contentType, String bodyText) throws IOException {
        // 1. 보낼 데이터 (매개변수 bodyText)
        // 2. 문자열을 바이트 배열로 바꾼다.
        byte[] bodyBytes = bodyText.getBytes(StandardCharsets.UTF_8);

        // 3. 응답 종류를 헤더에 적는다 (응답 : HTTP 메세지)
        exchange.getResponseHeaders().set("Content-Type", contentType);

        // 4. 상태코드와 본문 길이를 설정하며 헤더를 실제로 내보냄.
        // 헤더에 성공적으로 보냈을때 나타낼 코드(200)와 바디의 길이 담음.
        exchange.sendResponseHeaders(statusCode, bodyBytes.length);

        // 5. 헤더가 나간 다음에야 본문 통로가 열림.
        // getResponseBody()는 OutputStream이므로 문자열이 아니라 바이트를 사용함.
        try (OutputStream out = exchange.getResponseBody()) {
            out.write(bodyBytes);
        }
    }

    // JSON응답하는 경우는 다른 핸들러에서도 사용하는 경우가 생길 수 있음.  재활용위해 여기서 로직을 따로 작성.
    // new Gson().toJson(data) -> 자바 객체를 Json객체로 변환
    static void sendJson(HttpExchange exchange , int statusCode , Object data) throws IOException{
            sendResponse(exchange , statusCode , TYPE_JSON , new Gson().toJson(data));
    }

    // 요청 본문을 문자열로 읽는 기능.
    static String readRequestBody(HttpExchange exchange) throws IOException{
        StringBuffer reqBody = new StringBuffer();
        try (BufferedReader reader =
                     new BufferedReader(new InputStreamReader(exchange.getRequestBody(), StandardCharsets.UTF_8))) {
            String line;
            while ( (line = reader.readLine()) != null) {
                reqBody.append(line);
            }
        }
        return reqBody.toString();
    }
}