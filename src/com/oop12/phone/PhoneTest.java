package com.oop12.phone;

public class PhoneTest {
    public static void main(String[] args) {
    Person[] person = new Person[3];

    person[0] = new Person("김" , "1234");
    person[1] = new Person("이" , "456");

    for (int i = 0; i < person.length; i++) {
        if (person[i] != null) {
        person[i].showInfo();
        }
    }
    }

}
