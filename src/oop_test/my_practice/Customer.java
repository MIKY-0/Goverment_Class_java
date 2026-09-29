package oop_test.my_practice;

import com.oop14.B;

public class Customer {
    Bank bank;
    private String name;

    public Customer(Bank bank) {
        this.bank = bank;
    }
    public void printName() {
        System.out.println(bank.getName());
    }
}
