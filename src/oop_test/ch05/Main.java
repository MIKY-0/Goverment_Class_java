package oop_test.ch05;

public class Main {
    public static void main(String[] args) {
        DiscountPolicy a = new FixDiscountPolicy();
        RateDiscountPolicy b = new RateDiscountPolicy();

        OrderService orderService = new OrderService(a);

        orderService.takeOrder("아메리카노" , 4500);
        orderService.takeOrder("카페라떼" , 5000);
        orderService.takeOrder("바닐라라뗴" , 5500);

    }
}
