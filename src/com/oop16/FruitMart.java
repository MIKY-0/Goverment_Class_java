package com.oop16;

public class FruitMart {
    public static void main(String[] args) {
        // 다형성의 활용 - 하나의 배열에 여러 과일(타입) 담기.
        // 다형성이 없다면 타입별로 배열을 따로 만들어야됨.
        Banana[] banana = new Banana[10];
        banana[0] = new Banana();
        banana[1] = new Banana();


        Peach[] peach = new Peach[3];
        peach[0] = new Peach();
        peach[1] = new Peach();
        peach[2] = new Peach();

        System.out.println("================================");

        // 다형성을 사용하면 부모타입배열에 자식들을 모두 담을 수 있음.,
        Fruit[] fruits = new Fruit[4];
        fruits[0] = new Banana();
        fruits[1] = new Peach();
        fruits[2] = new Banana();
        fruits[3] = new Apple();

        // 만약 사과라면 할인금액으로 호출.
        for(int i = 0; i < fruits.length; i++) {
            fruits[i].showInfo();

            if(fruits[i] instanceof Banana) {
                ((Banana) fruits[i]).saleBanana();
            } else if(fruits[i] instanceof Apple){
                ((Apple) fruits[i]).saleApple();
            }
        }

    }
}
