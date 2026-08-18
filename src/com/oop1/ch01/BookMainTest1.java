package com.oop1.ch01;

public class BookMainTest1 {
    public static void main(String[] args) {
        // 힙영역에 객체 3개 생성. -> 메모리에 올라가면(인스턴스화) 객체라고 부름.
        Book book1 = new Book();
        Book book2 = new Book();
        Book book3 = new Book();

        System.out.println("book1 : " + book1);
        System.out.println("book2 : " + book2);
        System.out.println("book3 : " + book3);
    } // end of main
} // end of class
