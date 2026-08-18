package com.oop10;

public class Employee {
     int empNumber;
    private String name;
    private String department;


    // 문제상황 - 직원객체를 생성할 때 마다 자동으로
    // Company의 시리얼 번호를 활용해서 1001 , 또 직원이 생성되면 1002.....
    // 자동할당 되도록 코드 작성.
    public Employee(String name , String department) {
        this.name = name;
        this.department = department;
        this.empNumber = Company.empSerialNumber;
        Company.empSerialNumber++;
    }
}
