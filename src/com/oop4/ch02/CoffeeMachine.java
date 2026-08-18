package com.oop4.ch02;

public class CoffeeMachine {
    // 커피머신의 필드 : 물의 양(ml) , 원두 양(g)
    int water;
    int coffee;
    int cnt;

    // 생성자 설계.
    public CoffeeMachine(int water , int coffee) {
        this.water = water;
        this.coffee = coffee;
        System.out.printf("%dml의 물과 %dg의 원두가 준비되었습니다.\n" , water , coffee);
    }

    // 커피머신의 동작 : 1. 물 채우기  2. 원두 채우기   3. 커피 만들기
    void refillWater(int water) {
        if(water > 0) {
        this.water += water;
            System.out.println(water + "ml 물을 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 물을 채워주세요.");
        }
    }

    void refillCoffee(int coffee) {
        if(coffee > 0) {
            this.coffee += coffee;
            System.out.println(coffee + "g의 원두를 채웠습니다.");
        } else {
            System.out.println("0보다 큰 양의 원드를 채워주세요.");
        }
    }

    String makeCoffee() {
        if(water >= 100 && coffee >= 10) {
            water -= 100;
            coffee -= 10;
            cnt++;
            return "맛있는 커피 한잔 완성";
        } else {
            return "재료가 부족합니다. 물 또는 원두를 채워주세요";
        }
    }

    // 해당하는 객체의 현재 상태값을 출력. 이 메서드호출 했을때 바로 화면에 출력.
    void showInfo() {
        System.out.printf("=====================\n현재 준비된 물과 원두의 양 " +
                "\n물 : %dml , 원두 : %dg\n" , this.water , this.coffee );
    }

    // 현재까지 몇잔의 커피를 만들었는지.
    int totalCoffeeAmount() {
        return cnt;
    }
}
