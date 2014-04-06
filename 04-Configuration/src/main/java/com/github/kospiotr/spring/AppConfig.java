package com.github.kospiotr.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean(name = "ruleBillingService")
    public BillingService billingServiceBean() {
        return new BillingService();
    }

}
