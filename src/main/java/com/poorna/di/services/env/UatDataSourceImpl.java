package com.poorna.di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("UAT")
@Service
public class UatDataSourceImpl implements AppDataSource {
    @Override
    public String getDataSource() {
        return "UAT";
    }
}
