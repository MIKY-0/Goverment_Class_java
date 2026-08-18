package com.oop3.ch02;

import com.oop3.ch01.Student;

public class BusMainTest1 {
    public static void main(String[] args) {
        Bus b1 = new Bus();
        Student s1 = new Student();
        s1.stdName = "티모";

        b1.presentPeople = 10;
        b1.showBus();
        b1.getPeople(10);
        b1.showBus();
        b1.getOutPeople(5);
        b1.showBus();
        b1.stdInBus(s1);
        b1.showBus();
        b1.stdOutBus(s1);
        b1.showBus();

    }
}
