package com.example.e1_customer_management.repository.impl;

import com.example.e1_customer_management.model.Customer;
import com.example.e1_customer_management.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CustomerRepository implements ICustomerRepository {
    private static final Map<Integer, Customer> customers = new HashMap<>();

    static {
        customers.put(1, new Customer(1, "car", 121231313.0, "red,speed", "honda"));
        customers.put(2, new Customer(2, "engine", 1565431313.0, "yellow,speed", "sunhouse"));
        customers.put(3, new Customer(3, "cookies", 454.545, "black,speed", "sunhouse"));
        customers.put(4, new Customer(4, "washer", 128313.0, "blue", "toshiba"));
        customers.put(5, new Customer(5, "air condition", 1477.4, "white", "tosiba"));
    }

    @Override
    public List<Customer> findAllCustomer() {
        return new ArrayList<>(customers.values());
    }

    @Override
    public void save(Customer customer) {
        customers.put(customer.getId(),customer);
    }

    @Override
    public Customer findByIdCustomer(int id) {
        return customers.get(id);
    }

    @Override
    public void update(Integer id, Customer customer) {
        customers.put(id,customer);
    }

    @Override
    public void delete(int id) {
        customers.remove(id);
    }
}
