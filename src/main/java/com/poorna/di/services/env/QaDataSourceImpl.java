package com.poorna.di.services.env;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("QA")
@Service
public class QaDataSourceImpl implements AppDataSource {
    @Override
    public String getDataSource() {
        return "QA";
    }
}
