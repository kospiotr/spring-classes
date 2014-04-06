package com.github.kospiotr.spring;

import java.time.LocalDateTime;
import java.util.HashSet;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitialisationByValueObjects {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-initialisation-by-value.xml");

        Payment payment = new Payment("Pizza payment", "123", "321", 20, LocalDateTime.now(), new HashSet<String>());

        //requesting bean from the container by the id
        BillingService billingService1 = applicationContext.getBean("billingService1", BillingService.class);
        billingService1.processPayment(payment);

        BillingService billingService2 = applicationContext.getBean("billingService2", BillingService.class);
        billingService2.processPayment(payment);
    }

}
