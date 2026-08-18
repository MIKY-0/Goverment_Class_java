package com.oop1.ch02;

public class WarriaorMainTest {

    // 코드 실행의 진입점(메인 함수) - JVM - stack 영역
    public static void main(String[] args) {

        // new Warrior() --> 생성자
        Warrior w1 = new Warrior();

        // w1 참조 변수에 접근해서 값을 할당해보자.
        // 객체의 접근은 '.' 연산자.
        w1.name = "티모";
        w1.height = 10.5;
        w1.hp = 100;
        w1.attackPower = 70;
        w1.defensePower = 30;

        System.out.println("w1 주소값 : " + w1);
        System.out.println("w1 이름 : " + w1.name);
        System.out.println("w1 키 : " + w1.height);
        System.out.println("w1 체력 : " + w1.hp);
        System.out.println("w1 공격력 : " + w1.attackPower);
        System.out.println("w1 방어력 : " + w1.defensePower);

        System.out.println("==============================================");

        // Warrior 타입 객체 생성 후 필드에 값을 입력하고 출력.

        Warrior w2 = new Warrior();
        w2.name = "아이언맨";
        w2.hp = 1000;
        w2.height = 171.1;
        w2.attackPower = 500;
        w2.defensePower = 200;

        System.out.println("w2 이름 : " + w2.name);
        System.out.println("w2 키 : " + w2.height);
        System.out.println("w2 체력 : " + w2.hp);
        System.out.println("w2 공격력 : " + w2.attackPower);
        System.out.println("w2 방어력 : " + w2.defensePower);

    } // end of main
} // end of class
