package oop_test.my_practice;

public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank("국민은행");
        new Customer(bank).printName();
    }
}
