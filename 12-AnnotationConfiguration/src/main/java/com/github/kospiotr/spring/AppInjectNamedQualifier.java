package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInjectNamedQualifier {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-inject-named-qualifier.xml");

        Payment payment = new Payment("Pizza payment", "123", "321", 20);

        //requesting bean from the container by the id
        BillingServiceInjectNamedQualifier billingService1 = applicationContext.getBean("billingService", BillingServiceInjectNamedQualifier.class);
        billingService1.processPayment(payment);

    }

}
