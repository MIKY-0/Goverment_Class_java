package com.oop3.ch02;

import com.oop3.ch01.Student;

public class Bus {
    int presentPeople;
    int newPeople;
    int outPeople;

    int getPeople(int newPeople) {
        System.out.println("버스에 새로운 승객 " + newPeople + "명이 탑승했습니다.");
        return presentPeople += newPeople;
    }

    int getOutPeople(int outPeople) {
        System.out.println("버스에서 승객 " + outPeople + "명이 내렸습니다.");
        return presentPeople -= outPeople;
    }

    void showBus() {
        System.out.println("현재 버스에는 " + presentPeople + "명의 승객이 있습니다.");
    }

    int stdInBus(Student std) {
        System.out.println(std.stdName + "학생이 버스를 탑니다.");
       return presentPeople++;
    }

    int stdOutBus(Student std) {
        System.out.println(std.stdName + "학생이 버스를 내립니다.");
        return presentPeople--;
    }
}
