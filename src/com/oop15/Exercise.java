package com.oop15;

public class Exercise {
    private String ex;

    public Exercise(String ex) {
        this.ex = ex;
    }

    public void play() {
        System.out.println(ex + "을(를) 합니다.");
    }

}


class PlayGround {
    private String ex;
    private Exercise[] e;

    public PlayGround(Exercise[] e) {
        this.e = e;
    }

    public void showInfo(Exercise[] exer) {
        for(Exercise e  : exer) {
            e.play();
        }
    }

}