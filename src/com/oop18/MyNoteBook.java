package com.oop18;

public class MyNoteBook extends Computer{

    @Override
    public void display() {
        System.out.println("MyNoteBook의 화면이 켜집니다.");
    }

    @Override
    public void typing() {
        System.out.println("MyNoteBook 키보드로 타자를 칩니다. ");
    }
}
