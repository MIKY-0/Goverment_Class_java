package oop_test.ch07_challenge;

public class WeekendPricePolicy implements PricePolicy{
    private int extraPercent = 10;

    @Override
    public int calculate(int price) {
        return price * extraPercent / 100;



    }
}
