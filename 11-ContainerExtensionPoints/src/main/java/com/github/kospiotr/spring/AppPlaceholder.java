package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppPlaceholder {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-placeholder.xml");

        //requesting bean from the container by the id
        Payment payment1 = applicationContext.getBean("payment1", Payment.class);
        System.out.println("payment1 = " + payment1);
        Payment payment2 = applicationContext.getBean("payment2", Payment.class);
        System.out.println("payment2 = " + payment2);

    }

}
