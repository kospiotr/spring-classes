package com.github.pkosmowski.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSingleBean {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-single-bean.xml");

        //requesting bean from the container by the id
        BillingService billingServiceById = applicationContext.getBean("ruleBillingService", BillingService.class);
        billingServiceById.charge(100);

        BillingService billingServiceByType = applicationContext.getBean(BillingService.class); //returns also ruleBillingService bean
        billingServiceByType.charge(100);

    }

}
