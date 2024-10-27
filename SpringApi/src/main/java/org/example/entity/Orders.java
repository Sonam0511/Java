package org.example.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Orders")
public class Orders{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orderid")
    private int orderId;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "customerid", nullable = false)
    private Customer customer;

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
