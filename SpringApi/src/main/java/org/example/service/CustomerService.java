package org.example.service;

import org.example.entity.Customer;
import org.example.repository.CustomerRepository;
import org.springframework.data.domain.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    public Customer getCustomerById(int id) {
        return customerRepository.findById((int) id).orElse(null);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }


    public Customer updateCustomer(Customer customer){
        Optional<Customer> dbcustomer=customerRepository.findById(customer.getCustomerId());   //get request
        if(dbcustomer.isEmpty()){
            throw new RuntimeException("user not found");
        }
         Customer existingCustomer= dbcustomer.get();
        existingCustomer.setName(customer.getName());
         return customerRepository.save(existingCustomer);
    }
    public void deleteCustomer(int customerId){
        Optional<Customer> dbcustomer=customerRepository.findById((int) customerId);   //get request
        if(dbcustomer.isEmpty()){
            throw new RuntimeException("user not found");
        }
        customerRepository.delete(dbcustomer.get());
    }

    public void deleteCustomerByName(String name) {
        customerRepository.deleteByName(name);
    }
    public Page<Customer> getCustomers(Pageable pageable) {
        return customerRepository.findAll((org.springframework.data.domain.Pageable) pageable);
    }


}
