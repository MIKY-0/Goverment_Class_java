package com.oop10;

import java.util.Random;

public class Calculator {
    // static 메서드 - 함수 (객체 생성 필요 X)
    // 객체마다 결과가 달라질 이유가 없으므로 static메서드(함수) 적합.
    public static int add(int n1 , int n2) {
        return n1 + n2;
    }

    // 일반 인스턴스 메서드(객체 생성해야 사용가능) - 사실 이렇게 만들어도 되지만 static메서드(함수)로 만들길 권장.
    public int multiple(int n1 , int n2) {
        return n1 * n2;
    }

    // 사실 우리는 이미 static을 사용하고 있었음.
    public static void main(String[] args) {
        System.out.println("여기에 별도로 main함수 실행가능.");
        Calculator.add(10 , 10); // 가능한 이유는 static 메모리에 존재해서.

        // 자바 표준 API 사용.
       double ran = Math.random(); // 클래스.메서드 -> static메서드. -> Math객체 없이도 바로 호출 가능.
        System.out.println(ran);

        // 자바 표준 API - Random
        Random random = new Random();
        int ranInt = random.nextInt();
        System.out.println("ranInt : " + ranInt);

//        int lottoNum1 = random.nextInt(45); // 0 ~ 44까지 난수 하나 추출.
        int lottoNum1 = random.nextInt(45) + 1; // 1 ~ 45까지 난수 하나 추출.
        System.out.println(lottoNum1);

    }
}
