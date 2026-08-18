package com.oop15;

public class Cpu {
    private String type;

    public Cpu(String type) {
        this.type = type;
    }

    public void myCpu() {
        System.out.println(type + "을(를) 사용중");
    }
}
