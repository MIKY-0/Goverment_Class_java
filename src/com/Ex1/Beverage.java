package com.Ex1;

public abstract class Beverage {
    private String name;
    private int price;

    public Beverage(String name , int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {return name;}
    public int getPrice() {return price;}
    public void serve() {
        System.out.println(this.name + " 나왔습니다. 가격은 " + this.price + "입니다.");
    };

    public abstract void prepare();


}
