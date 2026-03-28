package com.cosmic.order.service;

import com.cosmic.order.model.Order;
import com.cosmic.order.repo.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    // Order එකක් ඇතුළත් කිරීම
    public Order saveOrder(Order order) {
        return orderRepository.save(order);
    }

    // සියලුම Orders ලබා ගැනීම
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}