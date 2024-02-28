package com.example.p2.controller;

import com.example.p2.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @GetMapping("/create-user")
    public ModelAndView showCreateForm()
    {
        ModelAndView modelAndView = new ModelAndView("/create");
        modelAndView.addObject("user",new User());
        modelAndView.addObject("gendersArray",new String[]{"Male","Female","Others"});
        modelAndView.addObject("hobbiesArray",new String[]{"Sport","Book","Food"});
        modelAndView.addObject("typesArray",new String[]{"Internal","local","domestic"});
        modelAndView.addObject("countriesArray",new String[]{"VietNam","america","canada"});
        return modelAndView;
    }
    @PostMapping("/create-user")
    public ModelAndView createUser(@ModelAttribute("user") User user)
    {
        ModelAndView modelAndView = new ModelAndView("/display");
        modelAndView.addObject("user",user);
        return modelAndView;
    }
}
