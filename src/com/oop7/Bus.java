package com.oop7;

public class Bus {
    private int busNumber;
    private int price;

    public Bus(int busNumber , int price) {
        this.busNumber = busNumber;
        this.price = price;
    }

    int busNum() {return this.busNumber;}
    int busPrice() {return this.price;}

    void tryBus() {
        System.out.println(this.busNumber + "번 버스를 탑승합니다. " + this.price + "원이 차감됩니다.");
    }

    void noMoney(Student std) {
        System.out.printf("남은 잔액(%d원)이 %d원 보다 적습니다. %d원 이상 충전해주세요.\n" ,
                std.stdMoney() , this.price , this.price - std.stdMoney());
    }

    int takeStd(Student std) {
        return std.stdMoney() - price;
    }
}
