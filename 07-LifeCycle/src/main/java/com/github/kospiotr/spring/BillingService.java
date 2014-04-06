package com.github.kospiotr.spring;

public class BillingService {

    public BillingService() {
        System.out.println("Constructed BillingService");
    }

    public void init() {
        System.out.println("BillingService initialized");
    }

    public void cleanUp() {
        System.out.println("BillingService clean up");
    }

}
