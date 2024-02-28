package com.example.e2.controller;

import com.example.e2.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TController {
    @Autowired
    IService service;
    @GetMapping("/translate")
    public String translate()
    {
        return "index";
    }
    @PostMapping("/translate")
    public  String translated(Model model, @RequestParam("tr")String tr)
    {

        String result = service.check_tr(tr);
        model.addAttribute("tr",result);
        return "index";
    }
}
