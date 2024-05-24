package com.datatables.demo.service;

import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.datatables.demo.model.Customer;

import jakarta.validation.Valid;


@Service("customerService")
public interface CustomerService {

    public DataTablesOutput<Customer> findAll(@Valid DataTablesInput input);

    public Customer getCustomerById(long customerId);

    public Customer save (Customer customer);

    
}
