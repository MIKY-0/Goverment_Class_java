package com.oop10.lotto;

public class LottoGame {
    public static void main(String[] args) {
        int game1 = LottoNumberMaker.makeNumber();
        int game2 = LottoNumberMaker.makeNumber();
        int game3 = LottoNumberMaker.makeNumber();
        int game4 = LottoNumberMaker.makeNumber();
        int game5 = LottoNumberMaker.makeNumber();
        int game6 = LottoNumberMaker.makeNumber();

        int a = (int)(Math.random() * 44) + 1;

        System.out.println(game1 + " , " + game2 + " , " + game3 + " , " + game4 + " , " +
                game5 + " , " + game6);
        System.out.println(a);
        // LottoNumberMaker객체 없음.
    }
}
