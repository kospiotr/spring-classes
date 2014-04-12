package com.github.kospiotr.spring;

import javax.annotation.Resource;

/**
 *
 * @author Piotr
 */
public class BillingServiceResourceSetter {

    private CreditCardProcessor creditCardProcessor;
    private TransactionLogger transactionLogger;

    public BillingServiceResourceSetter() {
        System.out.println("Constructed BillingService");
    }

    public BillingServiceResourceSetter(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLogger = transactionLogger;
        System.out.println("Constructed BillingService, and injected CreditCardProcessor and TransactionLogger");
    }

    public void processPayment(Payment payment) {
        creditCardProcessor.processPayment(payment);
        transactionLogger.logTransaction(payment);
    }

    @Resource
    public void setCreditCardProcessor(CreditCardProcessor creditCardProcessor) {
        System.out.println("Injected CreditCardProcessor to BillingService");
        this.creditCardProcessor = creditCardProcessor;
    }

    @Resource
    public void setTransactionLogger(TransactionLogger transactionLogger) {
        System.out.println("Injected TransactionLogger to BillingService");
        this.transactionLogger = transactionLogger;
    }

}
