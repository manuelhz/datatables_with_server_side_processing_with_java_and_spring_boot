package com.datatables.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long customerId;

    private String name;

    private String email;

    private String phoneNumber;

    private String address;

    public Customer(String[] customer) {
        this.name = customer[0];
        this.email = customer[1];
        this.phoneNumber = customer[2];
        this.address = customer[3];
    }
    
}
