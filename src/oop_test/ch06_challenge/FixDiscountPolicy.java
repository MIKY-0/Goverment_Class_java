package oop_test.ch06_challenge;


public class FixDiscountPolicy implements DiscountPolicy {
    private int discountAmount = 1000;

    @Override
    public int discount(int price) {
        return discountAmount;
    }
}
