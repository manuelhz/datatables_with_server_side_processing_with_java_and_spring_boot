package com.datatables.demo.repository;

import org.springframework.data.jpa.datatables.repository.DataTablesRepository;
import org.springframework.stereotype.Repository;

import com.datatables.demo.model.Customer;

@Repository
public interface CustomerRepository extends DataTablesRepository<Customer, Long> {
    
}
