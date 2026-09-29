package oop_test.ch05;

public class OrderService {
    private DiscountPolicy discountPolicy;

    // DI - 생성자 의존 주입.
    public OrderService(DiscountPolicy discountPolicy) {
        this.discountPolicy = discountPolicy;
    }

    public void takeOrder(String menuName, int price) {
        Order newOrder = new Order(menuName, price);
        int discountAmount = discountPolicy.discount(newOrder.getPrice());
        int finalPrice = newOrder.getPrice() - discountAmount;

        System.out.println(newOrder.getMenuName() + " | 정가 : " + newOrder.getPrice() + "원 | 할인 : " + discountAmount
                + "원 | 결제금액 : " + finalPrice + "원");
    }
}
