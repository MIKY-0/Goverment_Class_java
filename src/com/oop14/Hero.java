package com.oop14;

public class Hero {
    String name;
    int hp;

    public Hero(String name , int hp) {
        this.name = name;
        this.hp = hp;
    }

    void attack() {
        System.out.println("영웅이 공격합니다.");
    }
}


class Warrior extends Hero{

        public Warrior(String name , int hp) {
            super(name , hp);
        }

        void comboAttack() {
            System.out.println("2단 공격을 합니다.");
        }
}


class Archer extends  Hero {
    public Archer(String name , int hp) {
        super(name , hp);
    }

    void fireArrow() {
        System.out.println("불화살을 쏩니다.");
    }
}


class Wizard extends Hero{
    public Wizard(String name , int hp) {
        super(name , hp);
    }

    void freezing() {
        System.out.println("얼음마법을 사용합니다.");
    }
}