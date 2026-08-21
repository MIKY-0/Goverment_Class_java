package http.ch07;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

// /api/users
// GET : 메서드 목록을 조회.
// POST : 새 사용자 등록.
public class UserApiHandler implements HttpHandler {
    // 실제로는 DB에 저장하지만 지금은 DB안쓰고 메모리에 저장시켜놓자. --> 서버를 껐다 키면 저장데이터 사라짐.
    private static final List<User> userList = new ArrayList<>();
    private static int nextId = 1; // 다음에 부여할 id.

    // static 초기화 블록.
    // 클래스가 메모리에 처음 올라갈 때 딱 한번만 실행되는 코드 묶음.  이름도 없고 우리가 직접 호출하지않음.
    // JVM이 알아서 실행.
    static {
        addUser(new User("홍길동" , "a@naver.com"));
        addUser(new User("김철수" , "b@naver.com"));
    }

    private static synchronized int addUser(User user) {
        user.setId(nextId++); // 최소 1 <- 들어감.
        userList.add(user);
        return user.getId();
    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {
        try {
            // 여기서 Method는 GET,POST,DELETE,PUT
            // /api/users 경로 + Method(동작 정의) - GET , POST
            // 즉, 경로가 같아도 Method가 다르면 하는 일이 다름.
            // 그래서 이 핸들러 안에서 메서드로 한번 더 갈라줌.
            String method = exchange.getRequestMethod();

            if(method.equals("GET")) {
                handleGet(exchange);
            } else if (method.equals("POST")) {
                handlePost(exchange);
            }else {
                // 405를 보낼때는 어떤 메서드가 되는지 Allow헤더로 알려주는 것이 규칙.
                exchange.getResponseHeaders().set("Allow" , "GET , POST");
                SimpleHttpServer.sendResponse(exchange ,
                        405 , SimpleHttpServer.TYPE_TEXT , "지원하지 않는 메서드");
            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            exchange.close();
        }
    }

    /**
     * 목록을 복사해서 다시 돌려줌.
     * 왜 복사하는가?
     * 원본을 그대로 넘기면 Gson이 Json으로 객체를 바꾸면서 순회 도중 다른 스레드가 POST로 add 요청을 한다면
     * 보내려는 데이터가 POST의 영향을 받아 바뀌어서 예외가 발생함.
     * 즉, 순회 도중 ArraytList 크기가 바뀌면 예외를 던지는 증상이 발생.
     * 그래서 copyUserList 설계.
     */
    private ArrayList<User> copyUserList() {
        return new ArrayList<>(userList);
    }

    /**
     * GET : 사용자 목록을 조회. (HTTP 메세지 바디 없음)
     * List<User>를 그대로 넘기면 Gson이 Json 배열로 바꿔주도록 설계.
     */
    private void handleGet(HttpExchange exchange) throws IOException{
        SimpleHttpServer.sendJson(exchange , 200 , copyUserList());
    }

    /**
     * POST 요청 : 요청 본문이(HTTP 요청메세지 바디) 있음.
     */
    private void handlePost(HttpExchange exchange) throws IOException{
        // 1. HTTP 요청 바디를 읽어야함.
        /*
        readRequsetBody(exchange)로 Post요청 바디를 읽고 문자열로 저장.
        클라이언트가 요청한 Post는 서버에서 읽기전까지 문자열도 Json형식도 그 어떠한것에도 해당되지 않음.
        이 코드에서는 우리가 바디를 읽어서 reqBody에 문자열로 저장.
         */
        String reqBody = SimpleHttpServer.readRequestBody(exchange);
        System.out.println("POST 요청 [api/users] 받은 본문 확인 : " + reqBody);

        // 2. 서버가 받은 Json문자열을 User객체로 변환.
        // 주의 - 클라이언트가 부적절한 문자열을 보낼수 있는 경우를 생각해서 예외처리.

        try {
            /*
            근데 이 문자열이 Json형식이므로  new Gson().fromJson(reqBody , User.class)사용하여
            받은 Json객체를 User 객체로 변환.  Post요청을 성공적으로 받으면 User객체에 저장.
             */
            User user = new Gson().fromJson(reqBody , User.class);

            // 3. 검증.
            if(user == null || user.getName() == null || user.getName().isBlank()) {
                SimpleHttpServer.sendResponse(exchange ,
                        400 , SimpleHttpServer.TYPE_TEXT , "name은 반드시 입력해야합니다.");
                return;
            }

            if(user.getEmail() == null) {
                user.setEmail("");
            }

            // 4. 위 검증을 통과했다면 적절한 값이므로 저장 처리. id값은 고정값이 아니라서 저장결과를 돌려줌.
            int newId = addUser(user);

            // 5. 등록 성공은 200대신 201로 (Created)로 응답.
            /*
            새로 저장한 User객체를 성공적으로 등록됐다고 클라이언트에게 보여주기 위해 저장한 User 객체를
            sendJson() 사용해서 Json객체로 다시 클라이언트에게 저장한 데이터만 보여줌.
             */
            SimpleHttpServer.sendJson(exchange , 201 , user);
        } catch (JsonSyntaxException e) {
            SimpleHttpServer.sendResponse(exchange,
                    400 , SimpleHttpServer.TYPE_TEXT , "Json형식이 올바르지 않습니다.");
            return;
        }

        /*
    {
      "name" : "티모",
  	  "email" : "a@naver.com"
    }
         */

    }

}// end of class
