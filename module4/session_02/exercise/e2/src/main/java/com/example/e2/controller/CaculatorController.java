package com.example.e2.controller;

import com.example.e2.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/caculators")
public class CaculatorController {
    @Autowired
    private IService service;
    @GetMapping("")
    public String caculator()
    {
        return "caculator";
    }
    @PostMapping("")
    public String caculates(@RequestParam(name = "numberOne") Integer numberOne, @RequestParam(name = "numberTwo") Integer numberTwo, @RequestParam(name = "operator") String operator, Model model)
    {
        String result = service.caculate(numberOne,numberTwo,operator);
        model.addAttribute("message",result);
        return "caculator";
    }
}
