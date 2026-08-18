package com.oop18;

public class Person extends Human{

    @Override
    public void hunt() {
        System.out.println("사람이 동물을 사냥한다.");
    }

    public static void main(String[] args) {
        Animal animal = new Person();
        animal.hunt();
    }
}
