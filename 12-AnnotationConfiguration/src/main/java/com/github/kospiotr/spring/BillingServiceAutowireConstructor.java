package com.github.kospiotr.spring;

import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Piotr
 */
public class BillingServiceAutowireConstructor {
    private CreditCardProcessor creditCardProcessor;
    private TransactionLogger transactionLogger;

    public BillingServiceAutowireConstructor() {
        System.out.println("Constructed BillingService");
    }

    @Autowired
    public BillingServiceAutowireConstructor(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
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
