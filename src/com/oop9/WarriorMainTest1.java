package com.oop9;

public class WarriorMainTest1 {
    public static void main(String[] args) {
        Warrior w1 = new Warrior("전사");
        Warrior w2 = new Warrior("마법사");
        w1.levelUp();

        // Warrior의 필드들이 private인데 외부에서 값만 확인할 수 있는 방법.

        // getter 사용
//        String resultName1 = w1.getName();
//        System.out.println(resultName1);
//        System.out.println(w1.getName());

        // setter 사용
        // 필요에 의해서 필드 상태값을 변경해보자. 객체 상태 변경행위(메서드)를 통해 변경해야함.
        w1.setHp(80);
        w1.setLv(3);
        w1.setName("암살자");

        System.out.println();
        System.out.println(w1.getLv());
        System.out.println(w1.getHp());
        System.out.println(w1.getName());


    }
}
