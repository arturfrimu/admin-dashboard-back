package com.arturfrimu.tiktik.dto;

import com.arturfrimu.tiktik.model.Order;

public class OrderDto {
    public Long id;
    public String customerName;
    public String totalAmount;
    public String orderItems;
    public String location;
    public String status;
    public String statusBg;
    public String productImage;

    public OrderDto(Order order) {
        this.id = order.getId();
        this.customerName = order.getCustomerName();
        this.totalAmount = order.getTotalAmount();
        this.orderItems = order.getOrderItems();
        this.location = order.getLocation();
        this.status = order.getStatus();
        this.statusBg = order.getStatusBg();
        this.productImage = order.getProductImage();
    }
}
