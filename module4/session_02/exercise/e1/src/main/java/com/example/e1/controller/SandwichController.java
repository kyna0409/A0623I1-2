package com.example.e1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;

@Controller
public class SandwichController {
    @GetMapping("/sandwich")
    public String choose()
    {
        return "choose";
    }
    @PostMapping("/sandwich")
    public String condiments(@RequestParam(name = "condiment") String [] condiment, Model model)
    {
        String s = Arrays.toString(condiment);
        model.addAttribute("message", s);
        return "condiments";
    }
}
