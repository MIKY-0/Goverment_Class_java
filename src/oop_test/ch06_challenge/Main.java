package oop_test.ch06_challenge;


public class Main {
    public static void main(String[] args) {
        //MemoryOrderDao , RateDiscountPolicy , OrderService

        OrderDao memoryOrderDao = new MemoryOrderDao();
        DiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();

        OrderService orderService = new OrderService(memoryOrderDao, rateDiscountPolicy);

        memoryOrderDao.insert(new Order("아메리카노", 4500));
        memoryOrderDao.insert(new Order("라떼", 5500));
        memoryOrderDao.insert(new Order("바닐라라뗴", 5000));

        orderService.printAllOrders();

    }
}
