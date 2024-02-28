package com.example.e1.controller;

import com.sun.net.httpserver.Request;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.swing.*;

@Controller
public class ConvertController {
    @GetMapping("/convert")
    public String convert() {
        return "index";
    }
    @PostMapping("/convert")
    public String convert_vnd(Model model)
    {
        model.addAttribute("con",10);
        return "index";
    }
    public Action c()
    {

    }
}
