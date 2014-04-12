package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppResourceSetter {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-resource-setter.xml");

        Payment payment = new Payment("Pizza payment", "123", "321", 20);

        //requesting bean from the container by the id
        BillingServiceResourceSetter billingService1 = applicationContext.getBean("billingService", BillingServiceResourceSetter.class);
        billingService1.processPayment(payment);

    }

}
