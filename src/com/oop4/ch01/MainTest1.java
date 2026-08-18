package com.oop4.ch01;

public class MainTest1 {


    public static void main(String[] args) {
        Student s1 = new Student(1 , "야스오" , 2);
        /*
        s1.id = 1;
        s1.name = "야스오";
        s1.grade = 2;

        생성자를 활용하면 위 3줄의 코드로 객체의 필드에 한줄한줄 접근할 필요없이
        객체생성과 동시에 필드초기화 가능.
         */
        s1.showInfo();

    }
}
