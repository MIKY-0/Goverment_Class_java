package com.oop4.ch02;

public class CoffeeMachineTest {
    public static void main(String[] args) {
        CoffeeMachine machine1 = new CoffeeMachine(200 , 50);
        CoffeeMachine machine2 = new CoffeeMachine(50 , 10);

        String result1 = machine1.makeCoffee();
        System.out.println(result1);
        machine1.showInfo();
        machine1.makeCoffee();
        machine1.makeCoffee();
        machine1.makeCoffee();
        machine1.makeCoffee();
        machine1.makeCoffee();
        System.out.println("현재까지 만든 커피 수 : " + machine1.totalCoffeeAmount() + "잔");




    }
}
