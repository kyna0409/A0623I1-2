package com.example.e1_customer_management.service.impl;

import com.example.e1_customer_management.model.Customer;
import com.example.e1_customer_management.repository.ICustomerRepository;
import com.example.e1_customer_management.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository repository;

    @Override
    public List<Customer> findAllCustomer() {
        return repository.findAllCustomer();
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public Customer findByIdCustomer(int id) {
        return repository.findByIdCustomer(id);
    }

    @Override
    public void update(Integer id, Customer customer) {
        repository.update( id,  customer);
    }

    @Override
    public void delete(int id) {
        repository.delete(id);
    }
}
