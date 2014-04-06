package com.github.pkosmowski.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPrototypeBean {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-prototype.xml");

        //requesting bean from the container by the id
        BillingService service1 = applicationContext.getBean(BillingService.class);
        BillingService service2 = applicationContext.getBean(BillingService.class);
        BillingService service3 = applicationContext.getBean(BillingService.class);
    }

}
