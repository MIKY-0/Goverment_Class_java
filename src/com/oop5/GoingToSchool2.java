package com.oop5;

public class GoingToSchool2 {
    public static void main(String[] args) {
        Student std1 = new Student("김씨" , 10000);
        Student std2 = new Student("이씨" , 5000);

        // 밥 객체 메모리에 생성 - 직접 실행 흐름 작성.
        Rice rice1 = new Rice("볶음밥");

        rice1.showInfo();

        System.out.println();

        System.out.println(rice1.eatRice(20));
        std1.whetherYouEat(rice1);
        rice1.showInfo();

        System.out.println();

        System.out.println(rice1.eatRice(10));
        std1.whetherYouEat(rice1);
        rice1.showInfo();

        System.out.println();

        System.out.println(rice1.eatRice(15));
        std1.whetherYouEat(rice1);
        rice1.showInfo();

        System.out.println();

        System.out.println(rice1.eatRice(25));
        std1.whetherYouEat(rice1);
        rice1.showInfo();

        System.out.println();

        System.out.println(rice1.eatRice(30));
        std1.whetherYouEat(rice1);
        rice1.showInfo();
    }
}
