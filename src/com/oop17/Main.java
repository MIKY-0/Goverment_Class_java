package com.oop17;

public class Main {
    public static void main(String[] args) {
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Apple();

        // 문제 - if문 없이 sale메서드 호출.
        // 타입검사 필요없음. -> 새로운 과일타입이 추가되더라도 굳이 if문 작성 X.
        for(int i = 0; i < fruits.length; i++) {
            fruits[i].showInfo();
            fruits[i].sale();
        }
    }
    }

