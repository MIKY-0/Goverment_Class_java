package com.oop4.ch02;

public class CalculatorMain {

    // 두 정수를 더하는 함수.
    static int add(int a , int b) {return a + b;}

    // 두 정수를 빼는 함수.
    static int sub(int a , int b) {return a - b;}

    // 두 정수를 곱하는 함수.
    static int multiple(int a , int b) {return a * b;}

    // 두 정수를 나누는 함수.
    static double div(int a , int b) {
    if(b == 0) {
        System.out.println("분자는 0이 될 수 없음.");
        return 0;
    }
        return (double)a / b;
    }

    // 짝수인지 판별하는 함수.
    static String even(int a) {
        if(a % 2 == 0) return "짝수";
        else return "홀수";
    }

    // 홀수인지 판별하는 함수.
    static String odd(int a) {
        if(a % 2 != 0) return "홀수";
        else return "짝수";
    }

    public static void main(String[] args) {
        // 위 함수를 설계하고 테스트 해보기.
        int a = 50;
        int b = 5;
        System.out.printf("%d + %d = %d\n" , a , b , add(a , b));
        System.out.printf("%d - %d = %d\n" , a , b , sub(a , b));
        System.out.printf("%d * %d = %d\n" , a , b , multiple(a , b));
        System.out.printf("%d / %d = %.2f\n" , a , b , div(a , b));
        System.out.printf("%d는 %s\n" , a , odd(a));
        System.out.printf("%d는 %s\n" , b , even(b));


    }
}
