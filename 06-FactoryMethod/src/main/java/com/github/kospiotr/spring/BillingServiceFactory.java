package com.github.kospiotr.spring;

public class BillingServiceFactory {

    public BillingServiceFactory() {
        System.out.println("Constructed BillingServiceFactory");
    }

    public BillingService createBillingService() {
        //can bind manual properties
        //initialize some services manually
        //validate some entries, parameters, state manualy
        System.out.println("call BillingServiceFactory.createBillingService");
        return new BillingService();
    }

}
