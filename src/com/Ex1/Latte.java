package com.Ex1;

public class Latte extends Beverage{

    public Latte() {
        super("라떼" , 4500);
    }

    @Override
    public void prepare() {
        System.out.println(super.getName() + "에 물을 붓습니다.");
    }
}
