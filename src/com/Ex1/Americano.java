package com.Ex1;

public class Americano extends Beverage{

    public Americano() {
        super("아메리카노" , 3000);
    }

    @Override
    public void prepare() {
        System.out.println(super.getName() + "에 물을 붓습니다.");
    }
}
