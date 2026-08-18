package com.oop18;

public abstract class Animal {
    /*
     추상클래스란
     class 앞에 abstract 키워드가 있거나 하나 이상의 추상메서드가 있는 클래스.
     */

    String name;
    public void move() {
        System.out.println("이동합니다.");
    }

    public abstract void hunt(); // 추상메서드.
    // 추상메서드가 하나라도 있으면 그 클래스는 추상클래스이어야 한다.

    public static void main(String[] args) {
     // 추상클래스는 직접 객체생성 안됨.
//        Animal animal = new Animal();  // 직접  new 키워드 사용 X.
    }
}
