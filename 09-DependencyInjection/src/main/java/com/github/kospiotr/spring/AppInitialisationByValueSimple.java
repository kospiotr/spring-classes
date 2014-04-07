package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitialisationByValueSimple {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-initialisation-by-value-simple.xml");

        //requesting bean from the container by the id
        SimpleTypesDemo simpleTypesDemo = applicationContext.getBean("simpleTypesDemo", SimpleTypesDemo.class);
        System.out.println("simpleTypesDemo = " + simpleTypesDemo);
    }

}
