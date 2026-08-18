package com.oop16;

public class AnimalTest1 {
    public static void main(String[] args) {
        // 1. 자기 타입으로 바라보기.
        Animal animal = new Animal();
        animal.move();
        animal.eating();
        System.out.println("==============================");

        // 2 - 1. 부모 타입으로 자식 객체 바라보기(업캐스팅)
        Animal animal2 = (Animal)new Tiger(); // 업캐스팅된 상태(생략가능)
        animal2.move();
        animal2.eating();
//        animal2.hunting();  // Tiger객체더라도 컴파일러가 Animal타입만 보고 판단하기 때문에
//        animal2로 Tiger만 갖고있는 hunting() 메서드 호출 불가.
        System.out.println("==============================");

        // 3. 다운캐스팅 .
        Tiger tiger = (Tiger)animal2; // 강제 형변환.
        tiger.hunting(); // animal2를 다운캐스팅하여 Tiger타입으로 변환. 이제 컴파일러가 Tiger타입으로 인식해서
        // Tiger만 갖고있는 hunting() 메서드 호출 가능.

        // 2 - 2. 부모 타입으로 자식 객체 바라보기(업캐스팅)
        Animal animal3 = new Human();
        animal3.move();
        animal3.eating();
        System.out.println("==============================");

        /*  문제확인
//        animal3.readBook(); // Human객체에는 readBook() 메서드 호출 안됨.
         실제 객체는 Human이 맞지만 컴파일 시점에 readBook() 호출 불가능. --> 부모 타입으로 바라보고 있어서.
         핵심 - 컴파일 시점에는 타입만 바라보고 런타임 시점에는 실제 동작하는 객체의 행위가 실행.
        */
    }
}
