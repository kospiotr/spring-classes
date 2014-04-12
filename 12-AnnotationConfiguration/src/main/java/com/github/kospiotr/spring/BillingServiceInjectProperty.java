package com.github.kospiotr.spring;

import javax.inject.Inject;

/**
 *
 * @author Piotr
 */
public class BillingServiceInjectProperty {

    @Inject
    private CreditCardProcessor creditCardProcessor;
    @Inject
    private TransactionLogger transactionLogger;

    public BillingServiceInjectProperty() {
        System.out.println("Constructed BillingService");
    }

    public BillingServiceInjectProperty(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLogger = transactionLogger;
        System.out.println("Constructed BillingService, and injected CreditCardProcessor and TransactionLogger");
    }

    public void processPayment(Payment payment) {
        creditCardProcessor.processPayment(payment);
        transactionLogger.logTransaction(payment);
    }

    public void setCreditCardProcessor(CreditCardProcessor creditCardProcessor) {
        System.out.println("Injected CreditCardProcessor to BillingService");
        this.creditCardProcessor = creditCardProcessor;
    }

    public void setTransactionLogger(TransactionLogger transactionLogger) {
        System.out.println("Injected TransactionLogger to BillingService");
        this.transactionLogger = transactionLogger;
    }

}
