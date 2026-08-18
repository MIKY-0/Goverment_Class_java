package com.oop5;

public class Bus {
    int busNumber;
    int count;
    int money;

    // 멤버변수를 생성자를 통해서 초기화하지 않으면 기본값을 가짐.
    // int - 0  String - ""  double - 0.0   boolean - false

    public Bus(int busNumber) {this.busNumber = busNumber;}

    // 승객을 태우다.
    void take(int money) {
        this.money += money;
        count++;
    }

    // 현재 버스의 상태를 보여주는 메서드.
    void showInfo() {
        System.out.println("버스 번호 : " + busNumber);
        System.out.println("현재 승객 수 : " + count);
        System.out.println("현재 수익 금액 : " + money);
    }

}
