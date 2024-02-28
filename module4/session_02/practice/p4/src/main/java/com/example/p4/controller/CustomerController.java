package com.example.p4.controller;

import com.example.p4.model.Customer;
import com.example.p4.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customers")
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @GetMapping("")
    public String showListForm(Model model)
    {
        List<Customer> customers = service.findAllCustomer();
        model.addAttribute("customers",customers);
        return "customers/list";
    }
    @GetMapping("/create")
    public  String showCreateForm()
    {
        return "customers/create";
    }
    @PostMapping ("/create")
    public String CreateHandle(@RequestParam(name = "name") String name, @RequestParam(name = "email") String email, @RequestParam("address") String address, RedirectAttributes redirectAttributes)
    {
        int id = service.findAllCustomer().size();
        Customer customer = new Customer(id,name,email,address);
        service.save(customer);
        redirectAttributes.addFlashAttribute("message", "create successful !!!");
        return "redirect:/customers";
    }
    @GetMapping("{id}/update")
    public  String showUpdateForm(Model model,@PathVariable(name = "id") Integer id)
    {
        Customer customer = service.findCustomerById(id);
        model.addAttribute("customer",customer);
        return "customers/update";
    }

}
