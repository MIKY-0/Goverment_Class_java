package com.oop17;

public class Banana extends Fruit {
    private String origin;

    public Banana() {
        name = "바나나";
        price = 5000;
        origin = "필리핀";
    }

    @Override // 정액할인
    public void sale() {
        price -= 1000;
        System.out.println("할인된 바나나 가격 : " + price);
    }

    public String getOrigin() {return origin;}

}
