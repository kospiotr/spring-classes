package com.github.kospiotr.spring;

import java.util.Arrays;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class SimpleBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("PostProcess: " + Arrays.toString(beanFactory.getBeanDefinitionNames()));
    }

}
