package com.oop20;

public class RemoteControlMain {
    public static void main(String[] args) {
        // 인터페이스타입으로 객체를 받음.
        RemoteControl rc = new TV(); // 업캐스팅.
        rc.turnOn();
        rc.setVolume(15);
        rc.turnOff();

        System.out.println("================================");

        rc = new Audio();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

    }
}
