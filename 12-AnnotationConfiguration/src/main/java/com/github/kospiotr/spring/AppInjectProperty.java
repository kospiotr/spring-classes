package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInjectProperty {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-inject-property.xml");

        Payment payment = new Payment("Pizza payment", "123", "321", 20);

        //requesting bean from the container by the id
        BillingServiceInjectProperty billingService1 = applicationContext.getBean("billingService", BillingServiceInjectProperty.class);
        billingService1.processPayment(payment);

    }

}
