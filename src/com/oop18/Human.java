package com.oop18;

public abstract class Human extends Animal{
    // Animal에는 추상메서드가 있음. -> 상속받으려면 추상클래스로 만들거나 추상메서드를 오버라이딩해야됨.
    // 상속받는 Human클래스도 추상메서드를 상속받기 때문.

//    @Override
//    public void hunt() {
//        System.out.println("사람이 도끼로 사냥을 합니다.");
//    }

    public static void main(String[] args) {
//        Animal animal = new Human();
//        animal.hunt();
//        // Animal 직접 new 하지못하게 강제성 발휘.
    }
}
