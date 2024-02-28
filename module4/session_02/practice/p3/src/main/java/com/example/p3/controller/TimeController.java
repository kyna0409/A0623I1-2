package com.example.p3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/world-clock") // anh xa len phuong thuc xu ly
    public String getTimeByTimezone(Model model, @RequestParam(name = "city",required = false,defaultValue = "Asia/Ho_Chi_Minh") String city) {
      // khai bao tham so cua phuong thuc xu ly \, rang buoc voi tham so request
        Date date = new Date();
        // lay ra time zone hien tai
        TimeZone local = TimeZone.getDefault();
        // lay ra time zone hien tai
        TimeZone locale = TimeZone.getTimeZone(city);
        long locale_time = date.getTime()+(locale.getRawOffset()-local.getRawOffset());
        // tinh thoi gian hien tai cua mot thanh pho cu the
        date.setTime(locale_time);
        // cai dat lai thoi gian cho bien date thanh thoi gian hien tai cua thanh pho cu the
        model.addAttribute("city",city);
        model.addAttribute("date",date);
        // chuyen du lieu va gui qua view
        return "index";
    }

}
