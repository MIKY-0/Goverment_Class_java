package com.oop15;

import com.oop10.Company;
import com.oop14.C;

public class Computer {
    private Cpu intel;
    private Cpu rizen;

    public Computer() {
        this.intel = new Cpu("인텔코어");
        this.rizen = new Cpu("라이젠");
    }

    public void showInfo(Cpu cpu) {
        cpu.myCpu();
    }

    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.showInfo(c1.intel);
        System.out.println("=====================");
        c1.showInfo(c1.rizen);
    }
}
