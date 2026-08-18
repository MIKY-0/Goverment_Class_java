package com.oop13;

// 메서드 오버로딩 : 같은 이름의 메서드를 여러개 정의.
public class Calculator {
    // 두 정수의 덧셈.
    public int add(int a , int b) {
        return a + b;
    }

    // 두 실수의 덧셈.
    public double add(double a , double b) {
        return a + b;
    }

    // 세 정수의 덧셈.
    public int add(int a , int b , int c) {
        return a + b;
    }

    public static void main(String[] args) {
     // println도 오버로딩 기법.
        System.out.println(1);
        System.out.println(1.0);
        System.out.println(true);
        System.out.println("String");

    }
}
