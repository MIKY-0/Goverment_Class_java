package com.oop16;

public class FruitMainTest {
    public static void main(String[] args) {
    Fruit fruit1 = new Banana();
    Fruit fruit2 = new Peach();
    fruit1.showInfo();
    fruit2.showInfo();

//    fruit1.getOrigin(); // 컴파일 에러 - Fruit타입에서 getOrigin()메서드 없음.
        // 해결 : 다운캐스팅하여 컴파일러의 시선을 Banana로 바꿈.
        String result = ((Banana)fruit1).getOrigin();
        System.out.println("바나나 원산지 : " + result);

        // 하지만 이런 코드는 위험. 컴파일을 통과하지만 실제 객체가 다르면 ClassCastException 예외 발생.
    }
}
