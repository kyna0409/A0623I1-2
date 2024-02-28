package com.example.p1_validate_email.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Controller
public class HomeController {
    private static final String EMAIL_REGEX = "^[A-Za-z0-9]+[A-Za-z0-9]*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)$";
    private static Pattern pattern;
    private static Matcher matcher;
    @GetMapping("")
    public String home() {
        return "home";
    }
    @PostMapping(value = "/validate")
    public String user (@RequestParam(name = "email") String email, Model model)
    {
        boolean isValid = this.validate(email);
        if(!isValid)
        {
            model.addAttribute("message","Email is invalid");
            return "home";
        }
        model.addAttribute("message",email);
        return "success";
    }
    private boolean validate (String regex)
    {
        pattern = Pattern.compile(EMAIL_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
