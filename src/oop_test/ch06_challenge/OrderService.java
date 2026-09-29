package oop_test.ch06_challenge;


import java.util.List;

public class OrderService {
    private DiscountPolicy discountPolicy;
    private OrderDao dao;

    // DI - 생성자 의존 주입.
    public OrderService(OrderDao dao , DiscountPolicy discountPolicy) {
        this.dao = dao;
        this.discountPolicy = discountPolicy;
    }

    public void takeOrder(String menuName, int price) {
        Order newOrder = new Order(menuName, price);
        int discountAmount = discountPolicy.discount(newOrder.getPrice());
        int finalPrice = newOrder.getPrice() - discountAmount;

        System.out.println(newOrder.getMenuName() + " | 정가 : " + newOrder.getPrice() + "원 | 할인 : " + discountAmount
                + "원 | 결제금액 : " + finalPrice + "원");
    }

    public void printAllOrders() {
        List<Order> orders = dao.findAll();
        System.out.println("--- 전체 주문 내역 ---");
        for (Order order : orders) {
            System.out.println("메뉴: " + order.getMenuName() + " | 가격: " + order.getPrice() + "원");
        }
    }

}
