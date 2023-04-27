package com.poorna.di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("TEST")
@SpringBootTest
class FauxControllerTest {

    @Autowired
    FauxController fauxController;

    @Test
    void getEnv() {
        System.out.println(fauxController.getEnv());
    }
}