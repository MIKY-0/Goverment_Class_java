package oop_test.ch07_challenge;

public class WeekdayPricePolicy implements PricePolicy{
    private int discountAmount = 3000;

    @Override
    public int calculate(int price) {
        return price - discountAmount;
    }
}
