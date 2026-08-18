package com.oop15.practice;

class Student {
    private String name;
    public Student(String name) {this.name = name;}

    public void usePrint(Printer printer) {
        System.out.print(name + "이(가) ");
        printer.print();
    }
}


class Printer {
    public void print() {
        System.out.println("출력합니다.");
    }
}


public class StudentMain {
    public static void main(String[] args) {
        Printer printer = new Printer();
        Student std1 = new Student("홍길동");

        std1.usePrint(printer);
    }
}
