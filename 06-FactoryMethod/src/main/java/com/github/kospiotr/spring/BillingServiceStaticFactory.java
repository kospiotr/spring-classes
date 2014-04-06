package com.github.kospiotr.spring;

public class BillingServiceStaticFactory {

    public BillingServiceStaticFactory() {
        System.out.println("Constructed BillingServiceStaticFactory");
    }

    public static BillingService createBillingService() {
        //can bind manual properties
        //initialize some services manually
        //validate some entries, parameters, state manualy
        System.out.println("call BillingServiceFactory.createBillingService");
        return new BillingService();
    }

}
