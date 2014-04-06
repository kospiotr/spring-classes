package com.github.kospiotr.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BillingServiceJsr330LifecycleAware {

    public BillingServiceJsr330LifecycleAware() {
        System.out.println("Constructed BillingService");
    }

    @PostConstruct
    public void afterPropertiesSet() {
        System.out.println("BillingService initialized");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("BillingService destroyed");
    }

}
