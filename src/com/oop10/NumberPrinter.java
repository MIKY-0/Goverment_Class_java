package com.oop10;

public class NumberPrinter {
    int id;

    // static 영역 : 인스턴스(객체)들이 공유할 수 있는 메모리 영역.
    static int waitNumber; // 대기번호

    public NumberPrinter(int id) {
        this.id = id;
        this.waitNumber = 1;
    }

    // 번호표 출력 메서드
    public void printWaitNumber() {
        System.out.println(id + "기기의 대기 순번은 : " + waitNumber);
        waitNumber++;
    }

}
