package com.oop19;

public class AICar extends Car{
    @Override
    protected void drive() {
        System.out.println("자율 주행합니다. 또는 스스로 방향을 전환합니다.");
    }

    @Override
    protected void stop() {
        System.out.println("스스로 위험을 감지하거나 목적지에 도착하여 멈춥니다.");
    }
}
