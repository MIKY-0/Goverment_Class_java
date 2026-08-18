package com.oop12.phone;

public class Person {
    static int personCnt;
    private int id;
    private String name;
    private String phoneNumber;

    public Person(String name , String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        personCnt++;
        id = personCnt;
    }

    public int getId() {return this.id;}
    public String getName() {return this.name;}
    public String getPhoneNumber() {return this.phoneNumber;}

    public void showInfo() {
        System.out.printf("id : %d , 이름 : %s , 전화번호 : %s\n" , id , name , phoneNumber);
    }

}
