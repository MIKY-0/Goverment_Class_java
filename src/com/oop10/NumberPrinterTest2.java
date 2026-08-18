package com.oop10;

public class NumberPrinterTest2 {
    public static void main(String[] args) {
//        NumberPrinter printer1 = new NumberPrinter(1);
//        NumberPrinter printer2 = new NumberPrinter(2);

        /*
         static변수는 모든 객체가 공유하는 변수를 만들때 사용.
         static변수는 객체 생성전에 먼저 사용가능. --> 클래스변수 라고도 함.
         tip - static은 태양이다.
         */
        System.out.println(NumberPrinter.waitNumber);
        System.out.println(NumberPrinter.waitNumber);
    }
}
