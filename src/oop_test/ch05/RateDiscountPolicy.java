package oop_test.ch05;

public class RateDiscountPolicy implements DiscountPolicy {
    private int discountPercent = 10;

    @Override
    public int discount(int price) {
        return discountPercent * price / 100;
    }
}
