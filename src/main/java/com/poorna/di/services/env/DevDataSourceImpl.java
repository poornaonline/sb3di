package com.poorna.di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile({"DEV", "default"})
@Service
public class DevDataSourceImpl implements AppDataSource {
    @Override
    public String getDataSource() {
        return "Dev";
    }
}
