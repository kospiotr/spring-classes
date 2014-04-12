package com.github.kospiotr.spring;

import javax.inject.Inject;

/**
 *
 * @author Piotr
 */
public class BillingServiceInjectSetter {

    private CreditCardProcessor creditCardProcessor;
    private TransactionLogger transactionLogger;

    public BillingServiceInjectSetter() {
        System.out.println("Constructed BillingService");
    }

    public BillingServiceInjectSetter(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLogger = transactionLogger;
        System.out.println("Constructed BillingService, and injected CreditCardProcessor and TransactionLogger");
    }

    public void processPayment(Payment payment) {
        creditCardProcessor.processPayment(payment);
        transactionLogger.logTransaction(payment);
    }

    @Inject
    public void setCreditCardProcessor(CreditCardProcessor creditCardProcessor) {
        System.out.println("Injected CreditCardProcessor to BillingService");
        this.creditCardProcessor = creditCardProcessor;
    }

    @Inject
    public void setTransactionLogger(TransactionLogger transactionLogger) {
        System.out.println("Injected TransactionLogger to BillingService");
        this.transactionLogger = transactionLogger;
    }

}
