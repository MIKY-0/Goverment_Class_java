package com.oop1.ch01;

public class StudentMainTest1 {

    // 코드 실행의 시작점.(메인함수)
    public static void main(String[] args) {
     // 내가 설계한 클래스를 메모리에 직접 올려보자.
     // JVM 메모리에 올릴 수 있다.

     Student s1 = new Student(); // 클래스를 메모리에 올려라.(인스턴스화 했다)
     Student s2 = new Student();

        System.out.println("s1 : " + s1);
        System.out.println("s2 : " + s2);

        int grade = 10;
        double height = 1.1;

        System.out.println("grade : " + grade);
        System.out.println("height : " + height);

    } // end of main
} // end of class
