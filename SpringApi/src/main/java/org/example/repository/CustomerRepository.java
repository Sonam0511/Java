package org.example.repository;

import org.example.entity.Customer;
import org.hibernate.query.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    void deleteByName(String name);

}
