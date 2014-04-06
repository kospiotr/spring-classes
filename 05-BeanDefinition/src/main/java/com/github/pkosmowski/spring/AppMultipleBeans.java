package com.github.pkosmowski.spring;

import java.util.Map;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppMultipleBeans {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-multiple-beans.xml");

        //requesting bean from the container by the id
        Map<String, BillingService> billingService = applicationContext.getBeansOfType(BillingService.class);
        for (Map.Entry<String, BillingService> entry : billingService.entrySet()) {
            System.out.println("entry = " + entry.getKey());
            entry.getValue().charge(100);
        }
    }

}
