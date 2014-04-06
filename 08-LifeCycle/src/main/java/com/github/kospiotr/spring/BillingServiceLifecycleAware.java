package com.github.kospiotr.spring;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class BillingServiceLifecycleAware implements InitializingBean, DisposableBean {

    public BillingServiceLifecycleAware() {
        System.out.println("Constructed BillingService");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("BillingService initialized");
    }

    public void destroy() throws Exception {
        System.out.println("BillingService destroyed");
    }

}
