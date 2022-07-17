package com.arturfrimu.tiktik.model;

import com.arturfrimu.tiktik.dto.OrderDto;

public class Order {
    private Long id;
    private String customerName;
    private String totalAmount;
    private String orderItems;
    private String location;
    private String status;
    private String statusBg;
    private String productImage;

    public Order() {
    }

    public Order(Long id, String customerName, String totalAmount, String orderItems, String location, String status, String statusBg, String productImage) {
        this.id = id;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
        this.orderItems = orderItems;
        this.location = location;
        this.status = status;
        this.statusBg = statusBg;
        this.productImage = productImage;
    }

    public Order(OrderDto orderDto) {
        this.id = orderDto.id;
        this.customerName = orderDto.customerName;
        this.totalAmount = orderDto.totalAmount;
        this.orderItems = orderDto.orderItems;
        this.location = orderDto.location;
        this.status = orderDto.status;
        this.statusBg = orderDto.statusBg;
        this.productImage = orderDto.productImage;
    }

    public Long getId() {
        return id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public String getOrderItems() {
        return orderItems;
    }

    public String getLocation() {
        return location;
    }

    public String getStatus() {
        return status;
    }

    public String getStatusBg() {
        return statusBg;
    }

    public String getProductImage() {
        return productImage;
    }
}
