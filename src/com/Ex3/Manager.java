package com.Ex3;

public class Manager extends FullTimeEmployee{
    private int allowance; // 직책수당

    public Manager(String name , int id , int monthlySalary , int allowance) {
        super(name , id , monthlySalary);
        this.allowance = allowance;
    }

    @Override
    public int calculatePay() {
        return super.calculatePay() + this.allowance;
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("직책 수당 : " + this.allowance + "원");
    }
}
