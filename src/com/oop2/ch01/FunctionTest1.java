package com.oop2.ch01;

public class FunctionTest1 {
    // 함수 설계.
    // 두 정수를 입력 매개변수로 받아서 그 결과를 반환하는 기능.
    static int add(int n1 , int n2) {
        int result;
        result = n1 + n2;
        return result; // result를 반환.
    }

    // 위 add함수 사용.
    public static void main(String[] args) {
        System.out.println("내가 설계한 함수 사용");

        // 함수 호출.
        int result1 = add(10 , 20);
        System.out.println("result1 : " + result1);
    }
}
