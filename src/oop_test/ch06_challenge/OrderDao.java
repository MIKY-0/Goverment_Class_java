package oop_test.ch06_challenge;

import java.util.List;

public interface OrderDao {
    public void insert(Order order);
    List<Order> findAll();
}
