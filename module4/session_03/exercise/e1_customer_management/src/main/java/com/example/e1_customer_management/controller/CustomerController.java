package com.example.e1_customer_management.controller;

import com.example.e1_customer_management.model.Customer;
import com.example.e1_customer_management.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService service;
    @GetMapping("")
    public String showInf(Model model)
    {
        List<Customer> customerList = service.findAllCustomer();
        model.addAttribute("customers", customerList);
        return "index";
    }
    @GetMapping("/create")
    public String showCreate(Model model)
    {
        model.addAttribute("customer",new Customer());
        return "create";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute("customer") Customer customer, BindingResult bindingResult, RedirectAttributes redirectAttributes)
    {
        if(bindingResult.hasErrors())
        {
            return "create";
        }
        List<Customer> customerList = service.findAllCustomer();
        customer.setId(customerList.size()+1);
        service.save(customer);
        redirectAttributes.addFlashAttribute("success","You have successfully created a new customer !!!");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/edit")
    public String showUpdate(@PathVariable(name = "id") int id ,Model model)
    {
        Customer customer = service.findByIdCustomer(id);
        model.addAttribute("customer",customer);
        return "edit";
    }
    @PostMapping("/update")
    public String update(@ModelAttribute(name = "customer") Customer customer , BindingResult bindingResult , RedirectAttributes redirectAttributes)
    {
        service.update(customer.getId(),customer);
        return "redirect:/customer";
    }
    @GetMapping ("/{id}/delete")
    public String delete(@PathVariable(name = "id") int id,RedirectAttributes redirectAttributes)
    {
        service.delete(id);
        redirectAttributes.addFlashAttribute("success","you have successfully deleted a customer !!!");
        return "redirect:/customer";
    }
    @GetMapping("/{id}/view")
    public String showView(@PathVariable(name = "id") int id, Model model)
    {
        Customer customer = service.findByIdCustomer(id);
        model.addAttribute("customer",customer);
        return "view";
    }
    @PostMapping("/search")
    public String search(@RequestParam(name = "search_choose") String search_choose,@RequestParam(name = "search_txt") String search_txt,Model model)
    {
        List<Customer> customerList = null;
//        if(search_choose.equals("name"))
//        {
//            customerList = service.searchByName(search_txt);
//        }
        switch (search_choose)
        {
            case "name":
                customerList = service.searchByName(search_txt);
                break;
            case "price":
                customerList = service.searchByPrice(search_txt);
                break;
            case "producer":
                customerList = service.searchByProducer(search_txt);
                break;
            default:
                break;
        }
//        model.addAttribute("customers", customerList);
//        model.addAttribute("success","khong tim thay ket qua");

            model.addAttribute("customers", customerList);
        return "index";
    }
}
