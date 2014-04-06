package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppNonStaticFactoryMethod {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-non-static-method.xml");

        //requesting bean from the container by the id
        BillingService service1 = applicationContext.getBean("ruleBillingService", BillingService.class);
    }

}
