package com.example.p_demo_stringboot.controller;

import com.example.p_demo_stringboot.model.User;
import com.example.p_demo_stringboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/users")
public class MainController {
    @Autowired
    IUserService service;
    @GetMapping("")
    public String showHomePage() {
    return "index";
    }
    @GetMapping("/create")
    public String showCreate(Model model)
    {
        model.addAttribute("user",new User());
        model.addAttribute("message","CREATE USER");
        return "user_form";
    }
    @PostMapping("/save")
    public String save(@ModelAttribute(name = "user") User user, RedirectAttributes redirectAttributes)
    {
        service.save(user);
        redirectAttributes.addFlashAttribute("success","you have successfully created a new user ");
        return "redirect:/users";
    }
    @GetMapping("/list")
    public String showList(Model model)
    {
        List<User> users = service.findAll();
        model.addAttribute("users",users);
        return "users";
    }
    @GetMapping("/{id}/edit")
    public String showEdit(@PathVariable(name = "id") Integer id,Model model)
    {
        Optional<User> user = service.findById(id);
        model.addAttribute("user",user);
        model.addAttribute("message","EDIT USER HAVE ID IS "+id);
        return "user_form";
    }
    @GetMapping("/{id}/delete")
    public String delete(@PathVariable(name = "id") Integer id,RedirectAttributes redirectAttributes)
    {
        service.deleteById(id);
        redirectAttributes.addFlashAttribute("success","you have successfully deleted a user");
        return "redirect:/users";
    }
}
