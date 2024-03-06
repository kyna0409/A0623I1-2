package com.example.p2.service.impl;

import com.example.p2.model.Customer;
import com.example.p2.repository.ICustomerRepository;
import com.example.p2.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class CustomerService implements ICustomerService {
    @Autowired
    private ICustomerRepository customerRepository;

    @Override
    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer findById(Long id) {
        return customerRepository.findById(id);
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Long id) {
        customerRepository.remove(id);
    }

    @Override
    public void insertWithStoredProcedure(Customer customer) {
        customerRepository.insertWithStoredProcedure(customer);
    }
}
