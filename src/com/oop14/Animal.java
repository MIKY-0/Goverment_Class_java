package com.oop14;

public class Animal {
    String name;

    void eat() {
        System.out.println("Animal메서드도 함께 활용.");
    }
}


class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("고양이가 밥을 먹다");
    }
}


class Dog extends Animal{
    @Override
    void eat() {
        super.eat();
        System.out.println("강아지가 밥을 먹다.");
    }
}