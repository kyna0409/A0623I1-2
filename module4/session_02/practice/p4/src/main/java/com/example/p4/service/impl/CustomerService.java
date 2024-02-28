package com.example.p4.service.impl;

import com.example.p4.model.Customer;
import com.example.p4.repository.ICustomerRepository;
import com.example.p4.service.ICustomerService;
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
    public Customer findCustomerById(Integer id) {
        return repository.findCustomerById(id);
    }
}
