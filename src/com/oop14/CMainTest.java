package com.oop14;

public class CMainTest {
    public static void main(String[] args) {
        C c = new C();

        // 물려받기는 하지만 접근제한자에 따라서 접근을 할수있고 못할수 있다.
        c.age = 10;
        c.height = 100;
        c.weight = 200;
        c.Lv = 1;
        c.nickName = "c";

        System.out.println(c.age);
        System.out.println(c.height);
        System.out.println(c.weight);

    }
}
