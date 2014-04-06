package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAliasedBean {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-bean-with-alias.xml");

        //requesting bean from the container by the id
        BillingService service = applicationContext.getBean("service", BillingService.class);
        service.charge(100);
    }

}
