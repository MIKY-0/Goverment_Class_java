package com.oop15;

public class Car {
    private String name;
    private Engine engine;

    public Car(String name) {
        this.name = name;
        // 합성의 조건 1 : 밖에서 참조값을 받지않고 생성자나 메서드에서 직접 객체생성.
        // 즉, Car객체가 생성될때 Engine객체도 같이 생성.
        this.engine = new Engine("v8");
    }

    // 합성의 조건 2 : getEngine()를 만들지 않음.
    // 내부 Engine객체를 밖으로 보여주지 않음.

    public void start() {
        engine.start(); // Car에 시동을 건다. -> Engine에 시동이 먼저 걸려야함.
        System.out.println(name + "가 출발합니다.");
    }

    public void stop() {
        engine.start(); // Car가 멈추려면 -> Engine이 먼저 꺼져야함.
        System.out.println(name + "이 정지합니다.");
    }

}


