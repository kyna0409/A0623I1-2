package com.example.e1_customer_management.service;

import com.example.e1_customer_management.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> findAllCustomer();

    void save(Customer customer);

    Customer findByIdCustomer(int id);

    void update(Integer id, Customer customer);

    void delete(int id);

    List<Customer> searchByName(String searchTxt);

    List<Customer> searchByPrice(String searchTxt);

    List<Customer> searchByProducer(String searchTxt);
}
