package com.arturfrimu.tiktik.service;

import com.arturfrimu.tiktik.dto.OrderDto;

import java.util.List;

public interface OrderService {
    List<OrderDto> getOrders();
}
