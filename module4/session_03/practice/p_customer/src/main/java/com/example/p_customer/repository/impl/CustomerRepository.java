package com.example.p_customer.repository.impl;

import com.example.p_customer.model.Customer;
import com.example.p_customer.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {
    @Autowired
    private ICustomerRepository repository;

    @Override
    public List<Customer> findAll() {
        return repository.findAll();
    }

    @Override
    public void save(Customer customer) {
        repository.save(customer);
    }

    @Override
    public Customer findById(int id) {
        return repository.findById(id);
    }

    @Override
    public void update(int id, Customer customer) {
        repository.update(id,customer);
    }

    @Override
    public void remove(int id) {
        repository.remove(id);
    }
}
