package oop_test.ch04;

import java.util.List;

public interface OrderDao {
    void insert(Order order);
    List<Order> findAll();
}
