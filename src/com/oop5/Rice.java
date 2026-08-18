package com.oop5;

public class Rice {
    String menu;
    int amount = 100; // 남은 양

    public Rice(String menu) {this.menu = menu;}

    // 먹은 만큼 줄어든다. 성공하면 true , 실패하면 false 반환.
    boolean eatRice(int amount) {
        System.out.println(amount + "% 만큼 밥을 먹었습니다.");
        this.amount -= amount;
        if(amount > 0 )  {return true;}
        else {return false;}
    }

    // 정보창(showInfo) 설계.
    void showInfo() {
        System.out.println("현재 남은 " + menu + "의 양 : " + amount + "%");
    }

}
