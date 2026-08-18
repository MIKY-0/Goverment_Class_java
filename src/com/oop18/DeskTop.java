package com.oop18;

public class DeskTop extends Computer{
    @Override
    public void display() {
        System.out.println("화면이 켜집니다.");
    }

    @Override
    public void typing() {
        System.out.println("데스크톱 키보드로 타자를 칩니다.");
    }
}
