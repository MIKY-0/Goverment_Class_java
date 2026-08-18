package com.oop10;

public class Card {
    private int cardId;
    private String cardName;

    public int getCardId() {return cardId;}
    public String getCardName() {return cardName;}

    public Card(String cardName) {
        this.cardName = cardName;
        cardId = Company.cardNumber;
        Company.cardNumber++;
    }


}
