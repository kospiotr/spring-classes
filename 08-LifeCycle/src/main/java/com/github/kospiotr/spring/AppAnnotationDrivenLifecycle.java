package com.github.kospiotr.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppAnnotationDrivenLifecycle {

    public static void main(String[] args) {
        //create Inversion of Control container
        //create configuration and populate Inversion of Control container with it
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-configuration-annotation-driven-lifecycle.xml");

        //requesting bean from the container by the type
        BillingServiceJsr330LifecycleAware service1 = applicationContext.getBean(BillingServiceJsr330LifecycleAware.class);

        ((ConfigurableApplicationContext) applicationContext).close(); //forces context to shut down
    }

}
