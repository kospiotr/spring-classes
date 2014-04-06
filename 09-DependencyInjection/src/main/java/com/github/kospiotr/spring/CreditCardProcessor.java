package com.github.kospiotr.spring;

/**
 *
 * @author Piotr
 */
public class CreditCardProcessor {

    public CreditCardProcessor() {
        System.out.println("Constructed CreditCardProcessor");
    }

    public void processPayment(Payment payment) {
        System.out.println("Processing payment of amount: " + payment.getAmount() + " \n"
                + "  from: " + payment.getAccountFrom() + "\n"
                + "    to: " + payment.getAccountTo());
    }

}
