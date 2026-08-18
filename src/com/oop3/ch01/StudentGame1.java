package com.oop3.ch01;

public class StudentGame1 {
    public static void main(String[] args) {
        Student s1 = new Student(); // 객체 생성.

        // 참조변수를 사용해서 객체에 접근 후 값 할당.
        s1.stdId = 1;
        s1.stdName = "티모";
        s1.address = "부산";

        // 생성된 객체의 기능 호출.
        s1.study();
        s1.breakTime();
        s1.showInfo();

        /*
         메서드란?
          객체의 기능을 구현하기 위해 해당 클래스 내부에 구현되는 함수.

          메서드 vs 함수
          메서드는 구현부에 필드를 활용.
          함수는 구현부에 필드 X.
         */

        System.out.println("\n연습문제");
        // "시험을 친다." 메서드 작성,호출.
        // "청소를 한다." 메서드 작성,호출.
        s1.test();
        s1.clean();

        System.out.println("==============================");
        Student s2 = new Student();
        s2.stdId = 2;
        s2.stdName = "가렌";
        s2.address = "해운대";

        s2.test();
        s2.clean();
        s2.showInfo();

    }
}
