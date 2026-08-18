package com.oop15;

public class PlayMain {
    public static void main(String[] args) {
        Exercise e1 = new Exercise("축구");
        Exercise e2 = new Exercise("농구");
        Exercise e[] = {e1 , e2};

        PlayGround p = new PlayGround(e);
        p.showInfo(e);
        p = null;
        System.out.println();
        e1.play();
        e2.play();

    }
}
