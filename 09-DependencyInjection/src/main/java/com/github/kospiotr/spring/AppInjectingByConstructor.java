package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInjectingByConstructor {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-injection-by-constructor.xml");

        //requesting bean from the container by the id
        BillingService billingService = applicationContext.getBean("billingService", BillingService.class);
        billingService.processPayment(new Payment("Pizza payment", "123", "321", 20));
    }

}
