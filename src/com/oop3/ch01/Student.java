package com.oop3.ch01;

public class Student {
    // 속성(필드) , 클래스 영역에 선언된 변수 : 멤버변수 , 필드변수.
    int stdId;
    public String stdName; // Bus클래스에서 사용할거라서 접근제한자 public.
    // Bus 클래스와 서로 다른 패키지로 나눠놨음.
    String address;

    // 행위
    void study() {
        System.out.println(stdName + "학생이 공부를 합니다.");
    }

    void breakTime() {
        System.out.println(stdName + "학생이 휴식을 합니다.");
    }

    void showInfo() {
        System.out.println("---------상태창---------");
        System.out.println("학생 ID : " + stdId);
        System.out.println("학생 이름 : " + stdName);
        System.out.println("학생 거주지 : " + address);
    }

    void test() {
        System.out.println(stdName + "학생이 시험을 친다.");
    }

    void clean() {
        System.out.println(stdName + "학생이 청소를 한다.");
    }

}
