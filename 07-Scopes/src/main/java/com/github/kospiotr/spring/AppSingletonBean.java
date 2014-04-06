package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppSingletonBean {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-singleton.xml");

        //requesting bean from the container by the type
        BillingService service1 = applicationContext.getBean(BillingService.class);
        BillingService service2 = applicationContext.getBean(BillingService.class);
        BillingService service3 = applicationContext.getBean(BillingService.class);

        //service1, service2, service3 are the same object instance
    }

}
