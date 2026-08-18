package com.oop19;

// 클래스에 final 붙이면 상속불가.
public abstract class Car {
//    final private String NAME; // final은 상수.

    private void startCar() {
        System.out.println("시동을 켭니다.");
    }

    private void turnOff() {
        System.out.println("시동을 끕니다.");
    }

    // 핵심 : 이 메서드를 템플릿 메서드로 설계.
    // 템플릿 메서드 : 실행의 흐름이 미리 정의돼있음.
    final public void run() { // 메서드에 final 붙이면 고정된 메서드.(오버라이드 불가)
        startCar(); // 1. 시동먼저 걺.
        drive(); // 2. 시동걸렸으니 운전 가능.
        stop(); // 3. 정지하기.
        turnOff(); // 4. 시동끄기.
    }

    protected abstract void drive();
    protected abstract void stop();


}
