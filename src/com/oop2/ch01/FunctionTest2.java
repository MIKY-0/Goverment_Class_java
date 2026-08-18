package com.oop2.ch01;

public class FunctionTest2 {
    // 매개변수 , 반환타입 있는 함수.
    // 세 정수를 매개변수로 받고 정수의 차를 반환하는 함수.
    static int sub(int a , int b , int c) {
        int result = a - b - c;
        return result;
    }

    // 매개변수 있지만 반환타입이 없는 함수.
    static void hello(String greeting) {
        System.out.println("[[[" + greeting + "]]]👍👍👍👍");
    }

    // 매개변수는 없지만 반환타입이 있는 함수.
    static int calcSum() {
        // 지역변수는 초기화를 해주자.
        int sum = 0;
        int i;
        for(i = 1; i <= 100; i++) {
            sum += i;
        }
        return sum;
    }

    // 코드의 시작점(메인함수) - JVM의 stack영역.
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        // 함수 호출시 들어가는 값을 인수.
        hello("안녕 함수");
        hello("안녕 홍길동");
        System.out.println(sub(num1 , num2 , 10));
        System.out.println(calcSum());


    }
}
