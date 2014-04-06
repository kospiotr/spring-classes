package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class JavaConfigurationWay {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //requesting bean from the container by the id
        BillingService billingService = applicationContext.getBean("ruleBillingService", BillingService.class);
        billingService.charge(100);
    }

}
