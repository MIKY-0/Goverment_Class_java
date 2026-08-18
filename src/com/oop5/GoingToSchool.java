package com.oop5;

// 객체를 사용하고 실행해보는 테스트 측 코드.
public class GoingToSchool {
    public static void main(String[] args) {
    Bus bus133 = new Bus(133);
    Bus bus57 = new Bus(57);
    Student std1 = new Student("홍길동" , 10000);
    Student std2 = new Student("이순신" , 5000);


    std1.takeBus(bus133);
    std2.takeBus(bus133);

    std1.showInfo();
    std2.showInfo();
    System.out.println();
    bus133.showInfo();
    }
}
