package com.oop8;

public class Person {
    /*
     this의 3가지 사용 방법.
     1. 자기 자신의 주소를 가리킴.
     2. 생성자에서 다른 생성자를 호출 가능.
     3. 자기 자신의 주소값을 return값으로 반환 가능.
     */

    private String name;
    private int age;
    private String phone;
    private String gender;

    // this 사용1.
    public Person(String name , int age) {
        this.name = name;
        this.age = age;
    }

    // this 사용2.
    public Person(String name , int age , String phone) {
        this(name , age);
        this.phone = phone;
    }

    // this 사용2 복습.
    public Person(String name , int age , String phone , String gender) {
        this(name , age , phone);
        this.gender = gender;
    }

    // this 사용3. this는 자신의 주소값을 가리킴.
    // 메서드를 통해서 자기 자신의 주소값 반환 시켜야 하는 경우 this 활용.
    public Person gerPerson() {
        return this;
    }

}
