package com.oop9;

public class Warrior {
    private String name;
    private int Lv;
    private int hp;

    // getter 메서드. --> 읽기(가져오기) 전용.
    public String getName() {
        return name;
    }

    public int getLv() {
        return Lv;
    }

    public int getHp() {
        return hp;
    }

    // setter 메서드. --> 값 설정.(필요하다면!)
    // setter - 리턴이 없다. 매개변수가 있어야함.
    public void setName(String name) {
        this.name = name;
    }

    public void setLv(int Lv) {
        if(Lv <= 0) {
            System.out.println("레벨이 0보다 작을 수 없습니다.");
            return;
        }
        this.Lv = Lv;
    }

    public void setHp(int hp) {
        if( hp < 0) {
            System.out.println("체력이 0보다 작을 수 없습니다.");
            return;
        }
        this.hp = hp;
    }



    public Warrior(String name) {
        this.name = name;
        Lv = 1;
        hp = 100;
    }

    // 일반 메서드. lv필드 +1 , hp필드 +50 , 안내문구 출력.
    public void levelUp() {
        Lv++;
        hp += 50;
        System.out.println(name + "의 현재 레벨은 " + Lv + "입니다.");
    }

}
