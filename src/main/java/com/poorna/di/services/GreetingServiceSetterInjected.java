package com.poorna.di.services;


import org.springframework.stereotype.Service;

@Service("setterGreetingService")
public class GreetingServiceSetterInjected implements GreetingService{

    @Override
    public String sayGreeting() {
        return "I'm setter greeting bean";
    }
}
