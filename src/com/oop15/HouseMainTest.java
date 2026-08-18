package com.oop15;

public class HouseMainTest {
    public static void main(String[] args) {
        House house = new House("부산시 진구");
        house.showInfo();

        // House , Room 둘다 GC 대상.
        house = null;

    }
}
