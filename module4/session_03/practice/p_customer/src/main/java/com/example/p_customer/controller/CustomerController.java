package com.example.p_customer.controller;

import com.example.p_customer.model.Customer;
import com.example.p_customer.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @GetMapping("")
    public String index(Model model)
    {
        List<Customer> customerList = service.findAll();
        model.addAttribute("customers",customerList);
        return "/index";
    }
}
