package com.oop14;

public class ChildCalMainTest {
    public static void main(String[] args) {
        ChildCal childCal = new ChildCal();
        System.out.println(childCal.sum(10 , 10));
        System.out.println(childCal.multiply(10 , 0)); // 오버라이드한 메서드.
        System.out.println(childCal.minus(100 , 1));

        // 요구사항 요청 -> multiply메서드의 매개변수에 0이 들어오면 "0을 입력하지 마시오."
    }
}
