package com.oop16;

public class Banana extends Fruit{
    private String origin;

    public Banana() {
        name = "바나나";
        price = 5000;
        origin = "필리핀";
    }

    public String getOrigin() {return origin;}

    // Banana에만 있는 고유 메서드.
    public void saleBanana() {
        if(price <= 1000){
            System.out.println("더이상 할인할 수 없습니다.");
            return;
        }
        price -= 1000;
        System.out.println("바나나 가격을 할인합니다. 현재가격 : " + price);
    }
}
