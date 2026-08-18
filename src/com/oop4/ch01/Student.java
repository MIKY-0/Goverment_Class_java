package com.oop4.ch01;

/**
 * 생성자
 * 객체를 생성할 때 다음과 같은 모양으로 객체를 만들라고 지시하는것.
 * 이 객체를 만들기 위해 이 재료(속성)가 꼭 필요하다고 명시(강제).
 * 생성자는 객체를 생성할 때 반드시 존재.
 */

public class Student {
    int id;
    String name;
    int grade;

    // 사용자 정의 생성자를 만들지 않으면 코드에는 보이지 않지만 컴파일러가 자동으로 .class파일을 생성할 때
    // 기본생성자를 생성.
    // 하지만 개발자가 사용자 정의 생성자를 하나이상 만들었다면 기본생성자는 자동생성되지 않는다.

    // 문법 : 생성자는 리턴타입이 없고 클래스명과 동일.
    public Student(int n , String s , int g ) {
        // 생성자는 객체를 메모리에 올릴 때 가장 먼저 실행되는 코드.
        id = n;
        name = s;
        grade = g;
    }

    public void showInfo() {
        System.out.println("==============상태창==============");
        System.out.println("학번 : " + id);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + grade);
    }
}
