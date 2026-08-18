package com.Ex3;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new Manager("박팀장" , 1002 , 4000000 , 500000);

        emp1.printInfo();
        System.out.println("급여 : " + emp1.calculatePay() + "원");
        System.out.println("보너스 : " + ((FullTimeEmployee)emp1).calculateBonus() + "원");
    }
}
