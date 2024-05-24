package com.datatables.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.datatables.mapping.DataTablesInput;
import org.springframework.data.jpa.datatables.mapping.DataTablesOutput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.datatables.demo.model.Customer;
import com.datatables.demo.service.CustomerService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
public class RestCustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/api/customers")
    public DataTablesOutput<Customer> getCustomers(@Valid DataTablesInput input) {

        return customerService.findAll(input);

    }
    
}
