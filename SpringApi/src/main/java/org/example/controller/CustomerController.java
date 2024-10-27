package org.example.controller;

import org.example.entity.Customer;
import org.example.service.CustomerService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/list")
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Customer> getCustomerById(@PathVariable int id) {
        Customer customer = customerService.getCustomerById(id);
        if (customer != null) {
            return ResponseEntity.ok(customer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/create")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }
    @PostMapping("/save")
    public Customer save(@RequestBody Customer customer){
        return customerService.saveCustomer(customer);
    }

@PutMapping("/update")
    public Customer update(@RequestBody Customer customer){
        return customerService.updateCustomer(customer);
}
@DeleteMapping("/deleteById")
    public void delete(@RequestParam int customerId){
        customerService.deleteCustomer(customerId);
}
    @DeleteMapping("/deleteByName")
    public void deleteCustomerByName(@RequestParam String name) {
        customerService.deleteCustomerByName(name);
    }
    @GetMapping("/customers")
    public Page<Customer> getCustomers(
            @RequestParam(defaultValue = "0") int page,
            @RequestParam(defaultValue = "10") int size) {

        Pageable pageable = PageRequest.of(page, size);
        return customerService.getCustomers((java.awt.print.Pageable) pageable);
    }
}
