package com.poorna.di.controllers;


import com.poorna.di.services.GreetingService;
import com.poorna.di.services.GreetingServiceImpl;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController() {
        this.greetingService = new GreetingServiceImpl();
    }

    public String hello() {
        System.out.println("I'm from controller");
        return greetingService.sayGreeting();
    }
}
