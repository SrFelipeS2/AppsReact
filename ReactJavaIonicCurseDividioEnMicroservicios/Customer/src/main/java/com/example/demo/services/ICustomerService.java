package com.example.demo.services;

import com.example.demo.entities.Customer;

import java.util.List;

public interface ICustomerService {
    public List<Customer> getAll();
    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
