package org.example.controller;

import jakarta.persistence.criteria.Order;
import org.example.entity.Customer;
import org.example.entity.Orders;
import org.example.service.CustomerService;
import org.example.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public List<Orders> getAllOrders() {
        return ordersService.getAllOrders();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Orders> getOrderById(@PathVariable int id) {
        Orders order = ordersService.getOrderById(id);
        if (order != null) {
            return ResponseEntity.ok(order);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public ResponseEntity<Orders> createOrder(@RequestBody Orders order) {
        if (order.getCustomer() != null) {
            Customer customer = customerService.getCustomerById(order.getCustomer().getCustomerId());
            if (customer != null) {
                order.setCustomer(customer);
                Orders newOrder = ordersService.saveOrder(order);
                return ResponseEntity.ok(newOrder);
            }
        }
        return ResponseEntity.badRequest().body(null);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable int id) {
        Orders order = ordersService.getOrderById(id);
        if (order != null) {
            ordersService.deleteOrder(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}

