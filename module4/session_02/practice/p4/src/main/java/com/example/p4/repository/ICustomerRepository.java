package com.example.p4.repository;

import com.example.p4.model.Customer;

import java.util.List;

public interface ICustomerRepository  {
    List<Customer> findAllCustomer();

    void save(Customer customer);

    Customer findCustomerById(Integer id);
}
