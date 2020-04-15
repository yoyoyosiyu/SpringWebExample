package com.huayutech.controller;

import com.huayutech.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HomeController {

    @Autowired
    GreetingService greetingService;

    @GetMapping
    public String sayHello() {
        return greetingService.getGreeting();
    }

}
