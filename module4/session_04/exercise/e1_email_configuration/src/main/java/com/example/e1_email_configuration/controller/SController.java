package com.example.e1_email_configuration.controller;

import com.example.e1_email_configuration.model.S;
import com.example.e1_email_configuration.service.ISService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/email")
public class SController {
    @Autowired
    private ISService service;
    @GetMapping("")
    public String showEmail(Model model)
    {
        S s = service.findAll();
        model.addAttribute("s",s);
        return "email";
    }
    @GetMapping("/update")
    public String showUpdate(Model model)
    {
        S s = service.findAll();
        model.addAttribute("s",s);
        model.addAttribute("languages", new String[]{"English", "Vietnamese", "Japanese", "Chinese","Korea"});
        model.addAttribute("pageSizes", new int[]{5,10,15,20,25});
        return "setting";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute(name = "s") S s)
    {
        service.save(s);
        return "redirect:/email";
    }
}
