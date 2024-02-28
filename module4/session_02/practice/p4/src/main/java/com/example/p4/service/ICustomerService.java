package com.example.p4.service;

import com.example.p4.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomer();

    void save(Customer customer);

    Customer findCustomerById(Integer id);
}
