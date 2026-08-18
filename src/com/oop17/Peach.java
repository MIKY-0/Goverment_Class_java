package com.oop17;

public class Peach extends Fruit {
    // name , price , showInfo()를 Fruit에게 물려받음.
    public Peach() {
        name = "복숭아";
        price = 8000;
    }

    // sale()를 재정의하지 않음. 부모의 기본동작인 "할인대상이 아닙니다."가 실행.
}
