package com.example.p2.repository;

import com.example.p2.model.Customer;

public interface ICustomerRepository extends IGeneralRepository<Customer> {
    boolean insertWithStoredProcedure(Customer customer);
}
