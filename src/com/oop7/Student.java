package com.oop7;

public class Student {
    private String name;
    private int money;

    public Student(String name , int money) {
        this.name = name;
        this.money = money;
    }

    int stdMoney() {return this.money;}

    // 잔액 충전 메서드
    void charge(int plus) {
        this.money += plus;
        System.out.println(plus + "원 충전하여 " + money + "원 남았습니다.");
    }

    // 밥먹기 메서드
    void eatRice(Rice rice) {
        if(rice.ricePrice() > money) {
            rice.noMoney(this);
        } else {
            rice.tryEat();
            this.money = rice.eatStd(this);
        }
    }

    // 지하철 탑승 메서드
    void takeSubway(Subway subway) {
        if(subway.subPrice() > money) {
            subway.noMoney(this);
        } else {
            subway.trySubway();
            this.money = subway.takeStd(this);
        }
    }

    // 버스 탑승 메서드
    void takeBus(Bus bus) {
        if(bus.busPrice() > money) {
            bus.noMoney(this);
        } else{
            bus.tryBus();
            this.money = bus.takeStd(this);
        }
    }

    void showInfo() {
        System.out.println(name + "님의 남은 잔액 : " + money);
        System.out.println("==============================");
    }

}
