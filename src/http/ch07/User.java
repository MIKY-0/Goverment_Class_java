package http.ch07;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 데이터를 담는 클래스 (dto)
 * Gson은 자바객체와  Json 문자열을 서로 바꿔주는 라이브러리.
 * 그러려면 먼저 담을 그릇 , 즉 클래스가 있어야함.
 * 필드이름이 곧 JSON의 키가 됨.
 * {
 *  "id" : 1 ,
 *  "name" : "홍길동",
 *  "email" : "abc@naver.com"
 * }
 */
@Data     @AllArgsConstructor   @NoArgsConstructor
public class User {
    private int id;
    private String name;
    private String email;

    public User(String name , String email) {
        this.name = name;
        this.email = email;
    }
}
