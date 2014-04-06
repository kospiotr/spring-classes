package com.github.pkosmowski.spring;

public class BillingService {

    public BillingService() {
        System.out.println("Constructed BillingService");
    }

    public void charge(double payment) {
        System.out.println("Charged with payment = " + payment);
    }

}
