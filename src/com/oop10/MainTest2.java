package com.oop10;

public class MainTest2 {
    public static void main(String[] args) {
        Card c1 = new Card("국민은행");
        Card c2 = new Card("국민은행");
        Card c3 = new Card("국민은행");
        Card c4 = new Card("국민은행");

        System.out.println("카드회사 : " + c1.getCardName() + " , 카드 번호 : " + c1.getCardId());
        System.out.println("카드회사 : " + c2.getCardName() + " , 카드 번호 : " + c2.getCardId());
        System.out.println("카드회사 : " + c3.getCardName() + " , 카드 번호 : " + c3.getCardId());
        System.out.println("카드회사 : " + c4.getCardName() + " , 카드 번호 : " + c4.getCardId());
    }
}
