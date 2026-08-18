package com.oop5;

public class Subway {
    int lineNumber; // 호선
    int count; // 승객 수
    int money; // 수익금

    // 1. 생성자
    public Subway(int lineNumber) {this.lineNumber = lineNumber;}

    // 2. 승객을 태우고 수익금 증가하는 메서드.
    void takePerson(int money) {
        this.money += money;
        count++;
    }

    // 3. 정보 출력 메서드.
    void showInfo() {
        System.out.println("지하철 호선 : " + lineNumber);
        System.out.println("현재 승객 수 : " + count);
        System.out.println("현재 수익 금액 : " + money);
    }

}
