package com.example.p4.repository.impl;

import com.example.p4.model.Customer;
import com.example.p4.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customers = new ArrayList<>();
    static {
        customers.add(new Customer(1,"nguyen thi thu hoa","missnguyen@gmail.com","da nang"));
        customers.add(new Customer(2,"nguyen thi thu ","thu123@gmail.com","ha tinh"));
        customers.add(new Customer(3,"tran van xi","xi333@gmail.com","gia lai"));
        customers.add(new Customer(4,"my thi loan","loan453@gmail.com","thua thien hue"));
        customers.add(new Customer(5,"mai van thong","thong789@gmail.com","quang tri"));
    }
    @Override
    public List<Customer> findAllCustomer() {
        return customers;
    }

    @Override
    public void save(Customer customer) {
        customers.add(customer);
    }

    @Override
    public Customer findCustomerById(Integer id) {
        for (Customer customer: customers) {
            if(customer.getId()==id)
            {
                return customer;
            }
        }
        return null;
    }
}
