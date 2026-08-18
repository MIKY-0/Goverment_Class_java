package com.oop15.practice;

class Computer {
    private Cpu cpu;

    public Computer(String name) {
        this.cpu = new Cpu(name);
    }
        public void myCpu() {
            cpu.showInfo();
        }
}


class Cpu {
    private String cpu;

    public Cpu(String cpu) {this.cpu = cpu;}

    public void showInfo() {
        System.out.println("현재 CPU : " + cpu);
    }
}


public class ComputerMain {
    public static void main(String[] args) {
        Computer com1 = new Computer("인텔코어");
        Computer com2 = new Computer("라이젠");
        com1.myCpu();

    }
}
