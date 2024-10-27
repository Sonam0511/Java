package org.example.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerid")
    private int customerId;

    private String name;
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private List<Orders> orders;
    // Default Constructor
    public Customer() {}

    // Constructor
    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
