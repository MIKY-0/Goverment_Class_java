package com.oop16;

public class InstanceOfTest {
    public static void checkFruit(Fruit fruit) {
        // 캐스팅하기 전에 반드시 확인.
        if(fruit instanceof Banana) {
            System.out.println("바나나입니다.");
            // 여기서 다운캐스팅은 안전.
            Banana banana = (Banana) fruit;
            System.out.println("원산지 : " + banana.getOrigin());
            banana.saleBanana();
        } else if(fruit instanceof Peach) {
            System.out.println("복숭아입니다.");
            Peach peach = (Peach) fruit;
        } else {
            System.out.println("알수없는 과일.");
        }
    }

    public static void main(String[] args) {
     Fruit fruit1 = new Peach();
     Fruit fruit2 = new Banana();
        checkFruit(fruit1);
        System.out.println("==============================");
        checkFruit(fruit2);

    }
}
