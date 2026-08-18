package com.oop2.exercise;

public class Ex1 {
    // 함수1
    static void greet(String name) {
        System.out.println("안녕하세요, " + name + "님!");
    }

    // 함수2
    static int square(int a) {
        return a * a;
    }

    // 함수3
    static String signOfNumber(int a) {
        if (a > 0) return "positive";
        else if (a < 0) return "negative";
        else return "zero";
    }

    // 함수4
    static Boolean checkAdult(int a) {
        if (a >= 18) return true;
        else return false;
    }

    // 함수5
    static int findMax(int a, int b) {
        if (a > b) return a;
        else if (a < b) return b;
        else return 0;
    }

    public static void main(String[] args) {
        greet("한승환");
        System.out.println(square(5));
        System.out.println(signOfNumber(6));
        System.out.println(signOfNumber(-6));
        System.out.println(signOfNumber(0));
        System.out.println(checkAdult(20));
        System.out.println(checkAdult(10));
        System.out.println(findMax(6 , 8));

    }
}