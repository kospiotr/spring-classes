package com.github.kospiotr.spring;

import javax.annotation.Resource;

/**
 *
 * @author Piotr
 */
public class BillingServiceResourceProperty {

    @Resource
    private CreditCardProcessor creditCardProcessor;
    @Resource
    private TransactionLogger transactionLogger;

    public BillingServiceResourceProperty() {
        System.out.println("Constructed BillingService");
    }

    public BillingServiceResourceProperty(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
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
