package com.arturfrimu.tiktik.repository;

import com.arturfrimu.tiktik.model.Order;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class OrderRepository {
    public List<Order> findAll() {
        return orders;
    }

    private List<Order> orders = new ArrayList<>();

    {
        orders.add(new Order(10240L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10241L, "Vinet", "32.38", "Fresh Tomato", "USA", "in progress", "#FB9678", "product6"));
        orders.add(new Order(10242L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10243L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10244L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
        orders.add(new Order(10245L, "Vinet", "32.38", "Fresh Tomato", "USA", "pending", "#FB9678", "product6"));
    }
}
