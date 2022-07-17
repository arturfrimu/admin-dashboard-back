package com.arturfrimu.tiktik.mapper;

import com.arturfrimu.tiktik.dto.OrderDto;
import com.arturfrimu.tiktik.model.Order;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class OrderMapper implements Mapper<Order, OrderDto> {
    @Override
    public Order toEntity(OrderDto orderDto) {
        return new Order(orderDto);
    }

    @Override
    public List<Order> toEntity(List<OrderDto> orderDtos) {
        return orderDtos.stream().map(orderDto -> toEntity(orderDto)).collect(Collectors.toList());
    }

    @Override
    public OrderDto toDto(Order order) {
        return new OrderDto(order);
    }

    @Override
    public List<OrderDto> toDto(List<Order> orders) {
        return orders.stream().map(order -> toDto(order)).collect(Collectors.toList());
    }
}
