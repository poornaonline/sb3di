package com.poorna.di.services.i18n;

import com.poorna.di.services.GreetingService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

//@Profile("SP")
//@Service("i18nService")
public class GreetingServiceInSpanish implements GreetingService {

    @Override
    public String sayGreeting() {
        return "Hello - Spanish";
    }
}
