package com.github.kospiotr.spring;

public class App {

    public static void main(String[] args) {
        BillingService billingService = new BillingService();
        billingService.charge(100);
    }
}
