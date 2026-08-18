package com.Ex2;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("김정규" , 1001 , 3200000);
        Employee emp2 = new PartTimeEmployee("이알바" , 2001 , 10030 , 80);

        emp1.printInfo();
        System.out.println("급여 : " + emp1.calculatePay());
        System.out.println("=======================");
        emp2.printInfo();
        System.out.println("급여 : " + emp2.calculatePay());
    }
}
