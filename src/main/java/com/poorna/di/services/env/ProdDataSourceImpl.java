package com.poorna.di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PROD")
@Service
public class ProdDataSourceImpl implements AppDataSource {
    @Override
    public String getDataSource() {
        return "Prod";
    }
}
