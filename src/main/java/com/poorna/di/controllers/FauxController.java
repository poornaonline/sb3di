package com.poorna.di.controllers;

import com.poorna.di.services.env.AppDataSource;
import org.springframework.stereotype.Controller;

@Controller
public class FauxController {

    private final AppDataSource appDataSource;

    public FauxController(AppDataSource appDataSource) {
        this.appDataSource = appDataSource;
    }

    public String getEnv() {
        return appDataSource.getDataSource();
    }
}
