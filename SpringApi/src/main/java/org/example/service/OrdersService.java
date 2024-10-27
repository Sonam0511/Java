package org.example.service;


import org.example.entity.Orders;
import org.example.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrdersService {

    @Autowired
    private OrdersRepository ordersRepository;

    public List<Orders> getAllOrders() {
        return ordersRepository.findAll();
    }

    public Orders getOrderById(int id) {
        return (Orders) ordersRepository.findById(id).orElse(null);
    }

    public Orders saveOrder(Orders order) {
        //return null;
        return ordersRepository.save(order);
    }

    public void deleteOrder(int id) {
        ordersRepository.deleteById(id);
    }


}
