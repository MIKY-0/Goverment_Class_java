package com.oop15;

public class UserMainTest {
    public static void main(String[] args) {
     // 1. Todo1객체와 User1객체는 서로 몰라도 각자 생성됨.(독립적)
        Todo todo1 = new Todo("자바복습");
        User user1 = new User(1 , "홍길동");

        // 2. 아직 연결되지 않은 상태.
        user1.displayMyTask();
        System.out.println("=========================");

        // 3. 연관관계 형성. - user1이 todo1의 주소값을 갖게되는 시점.
        user1.setTodo(todo1);
        user1.displayMyTask();
        System.out.println("============================");

        // 4. todo1 참조변수를 통해 상태를 변경.
        todo1.setCompleted(true);

        // 5. user1을 통해 조회해도 바뀐상태가 보임. 즉, 복사본이 아니라 같은 객체 하나를 함께 가리킴.
        user1.displayMyTask();





    }
}
