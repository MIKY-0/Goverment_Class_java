package com.oop4.ch01;

public class Bus {
    int busNumber;
    int money;

    // 생성자는 여러개 생성가능 (생성자 오버로딩)
    public Bus(int n) {
        busNumber = n;
    }

    public Bus(int n , int m) {
        busNumber = n;
        money = m;
    }


}
