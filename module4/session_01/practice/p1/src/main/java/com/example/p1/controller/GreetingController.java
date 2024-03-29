package com.example.p1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class GreetingController {
    //        @RequestParam: là annotation để đánh dấu rằng name là tham số được truyền vào
//        model: là đối tượng để truyền dữ liệu từ controller sang view
//        model.addAttribute(): là phương thức để truyền một dữ liệu từ controller sang view

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name , Model model){
        model.addAttribute("name", name);
        return "index";
    }
}
