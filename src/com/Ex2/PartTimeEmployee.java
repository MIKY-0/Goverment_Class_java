package com.Ex2;

public class PartTimeEmployee extends Employee{
    private int hourlyWage;
    private int workHours;

    public PartTimeEmployee(String name , int id , int hourlyWage , int workHours) {
        super(name , id);
        this.hourlyWage = hourlyWage;
        this.workHours = workHours;
    }


    @Override
    public int calculatePay() {
        return workHours * hourlyWage;
    }

    @Override
    public void printInfo() {
        System.out.println("이번달 근무 시간 : " + this.workHours);
        super.printInfo();
    }
}
