package com.oop5;

public class Student {
    String name;
    int money;

    public Student(String name , int money) {
        this.name = name;
        this.money = money;
    }

    // 메서드1. 학생이 버스를 탄다.
    void takeBus(Bus bus) {
        // 자신의 일을 직접 스스로 해결.
        bus.take(1000);
        this.money -= 1000;
    }

    // 메서드2. 학생이 지하철을 탄다.
    void takeSubway(Subway subway) {
        subway.takePerson(500);
        money -= 500;
    }

    // 메서드3. 학생이 밥을 다 먹었는지. (남은 양이 없으면 밥을 다먹었다.)
    void whetherYouEat(Rice rice) {
        if(rice.amount <= 0) System.out.println(name + "님이 밥을 다먹었습니다.");
        else System.out.println("아직 밥이 남았습니다.");
    }

    // 메서드. 정보창 보여주는 기능.
    void showInfo() {
        System.out.println(name + "님의 현재 남은 금액 : " + money);
    }

}
