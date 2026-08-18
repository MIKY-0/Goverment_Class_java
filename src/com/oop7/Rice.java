package com.oop7;

public class Rice {
    private String menu;
    private int price;

    public Rice(String menu , int price) {
        this.menu = menu;
        this.price = price;
    }

    String riceMenu() {return this.menu;}
    int ricePrice() {return this.price;}

    void tryEat() {
        System.out.println(this.menu + "를 먹습니다. " + this.price + "원이 차감됩니다.");
    }

    void noMoney(Student std) {
        System.out.printf("남은 잔액(%d원)이 %s(%d원) 보다 적습니다. %d원 이상 충전해주세요.\n" ,
                std.stdMoney() , this.menu , this.price , this.price - std.stdMoney());
    }

    int eatStd(Student std) {
        return std.stdMoney() - price;
    }
}
