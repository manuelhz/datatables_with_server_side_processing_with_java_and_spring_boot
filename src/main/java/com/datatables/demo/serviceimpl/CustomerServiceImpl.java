package com.datatables.demo.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.stereotype.Service;

import com.datatables.demo.model.Customer;
import com.datatables.demo.repository.CustomerRepository;
import com.datatables.demo.service.CustomerService;

import jakarta.validation.Valid;



@Service("customerService")
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    @Override
    public DataTablesOutput<Customer> findAll(@Valid DataTablesInput input) {
        return customerRepository.findAll(input);
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(long customerId) {
        return customerRepository.findById(customerId).get();
    }
    
}
