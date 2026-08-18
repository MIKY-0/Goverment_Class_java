package com.oop17;

public class Apple extends Fruit {
    public Apple() {
        name = "사과";
        price = 3000;
    }

    @Override // 정률할인
    public void sale() {
        int discount = price / 10;
        price -= discount;
        System.out.println("사과 할인 가격 : " + price);
    }
}
