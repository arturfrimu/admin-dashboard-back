package com.arturfrimu.tiktik.service;

import com.arturfrimu.tiktik.dto.OrderDto;
import com.arturfrimu.tiktik.mapper.Mapper;
import com.arturfrimu.tiktik.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    private final Mapper orderMapper;
    private final OrderRepository orderRepository;

    @Autowired
    public OrderServiceImpl(Mapper orderMapper, OrderRepository orderRepository) {
        this.orderMapper = orderMapper;
        this.orderRepository = orderRepository;
    }

    @Override
    public List<OrderDto> getOrders() {
        return orderMapper.toDto(orderRepository.findAll());
    }
}
