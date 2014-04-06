package com.github.kospiotr.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

public class App {

    public static void main(String[] args) {
        //create Inversion of Control container
        BeanFactory beanFactory = new DefaultListableBeanFactory();

        //create configuration and populate Inversion of Control container with it
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader((BeanDefinitionRegistry) beanFactory);
        reader.loadBeanDefinitions(new ClassPathResource("spring-configuration.xml"));

        //requesting bean from the container by the id
        BillingService billingService = beanFactory.getBean("ruleBillingService", BillingService.class);
        billingService.charge(100);
    }

}
