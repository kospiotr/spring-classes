package com.github.kospiotr.spring;

import javax.annotation.Resource;

/**
 *
 * @author Piotr
 */
public class BillingServiceResourceNamed {

    private CreditCardProcessor creditCardProcessor;

    private TransactionLogger transactionLogger;

    public BillingServiceResourceNamed(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLogger = transactionLogger;
        System.out.println("Constructed BillingService, and injected CreditCardProcessor and TransactionLogger");
    }

    public void processPayment(Payment payment) {
        creditCardProcessor.processPayment(payment);
        transactionLogger.logTransaction(payment);
    }

    @Resource(name = "creditCardProcessor1")
    public void setCreditCardProcessor(CreditCardProcessor creditCardProcessor) {
        System.out.println("Injected CreditCardProcessor to BillingService");
        this.creditCardProcessor = creditCardProcessor;
    }

    public BillingServiceResourceNamed() {
        System.out.println("Constructed BillingService");
    }

    @Resource(name = "transactionLogger1")
    public void setTransactionLogger(TransactionLogger transactionLogger) {
        System.out.println("Injected TransactionLogger to BillingService");
        this.transactionLogger = transactionLogger;
    }

}
