package com.poorna.di.controllers;

import com.poorna.di.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @Autowired
    public void setSetterInjectedController(SetterInjectedController setterInjectedController) {
        this.setterInjectedController = setterInjectedController;
    }

    @Test
    void sayHello() {
        System.out.println(setterInjectedController.sayHello());
    }
}