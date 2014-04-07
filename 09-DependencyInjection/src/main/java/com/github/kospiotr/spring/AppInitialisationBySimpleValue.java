package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppInitialisationBySimpleValue {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-initialisation-by-simple-value.xml");

        //requesting bean from the container by the id
        SimpleTypesDemo simpleTypesDemo = applicationContext.getBean("simpleTypesDemo", SimpleTypesDemo.class);
        System.out.println("simpleTypesDemo = " + simpleTypesDemo);
    }

}
