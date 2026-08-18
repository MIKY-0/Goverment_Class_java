package com.oop15;

import com.oop14.Cal;

public class CarMainTest {
    public static void main(String[] args) {
        Car car = new Car("BMW");
        car.start();
        System.out.println("============================");
        car.stop();

        // 외부에서는 Engine객체에 접근할 방법 없음.
        // 합성관계라고 말할 수 있음.
    }
}
