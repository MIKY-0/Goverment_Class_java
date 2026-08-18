package com.oop15;

import com.oop14.B;

public class MainTest {
    public static void main(String[] args) {
        // 1. 책 객체를 외부에서 먼저 생성.
        Book b1 = new Book("자바의 정석");
        Book b2 = new Book("이펙트브 자바");

        // 도서관을 만들고 책을 넣을 수 있음.
        Library library1 = new Library(5);
        library1.addBook(b1);
        library1.addBook(b2);
        library1.showBooks();

        System.out.println("=============도서관 폐관=============");

        // 도서관 객체를 가리키던 참조를 끊는다.
        // 주의 : 이 순간 객체가 사라지는 것이 아니라 GC의 수거 대상이 될뿐.
        library1 = null;

        // 도서관은 사라졌지만 b1 , b2는 여전히 살아있음.
        // 즉, b1 , b2변수가 각 Book객체를 가리키고있기 때문에 GC대상이 안됨.
    }
}
