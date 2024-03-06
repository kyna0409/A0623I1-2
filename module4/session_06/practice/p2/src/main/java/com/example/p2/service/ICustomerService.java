package com.example.p2.service;

import com.example.p2.model.Customer;

public interface ICustomerService extends IGeneralService<Customer> {
    void insertWithStoredProcedure(Customer customer);
}
