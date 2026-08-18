package com.oop16;

public class Apple extends Fruit{
    public Apple() {
        name = "사과";
        price = 3000;
    }

    // 정률 할인(백분율을 활용한 할인) , 정액 할인(고정가격을 활용한 할인)
    public void saleApple() {
        int discount = price / 10;
        price -= discount;
        System.out.println("사과 10% 할인. 현재가격 : " + price);
    }

}
