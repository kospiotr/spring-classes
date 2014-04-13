package com.github.kospiotr.spring;

import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Piotr
 */
public class BillingServiceInjectNamedQualifier {

    private CreditCardProcessor creditCardProcessor;
    private TransactionLogger transactionLogger;

    public BillingServiceInjectNamedQualifier() {
        System.out.println("Constructed BillingService");
    }

    public BillingServiceInjectNamedQualifier(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLogger = transactionLogger;
        System.out.println("Constructed BillingService, and injected CreditCardProcessor and TransactionLogger");
    }

    public void processPayment(Payment payment) {
        creditCardProcessor.processPayment(payment);
        transactionLogger.logTransaction(payment);
    }

    @Inject
    @Named("creditCardProcessor1")
    public void setCreditCardProcessor(CreditCardProcessor creditCardProcessor) {
        System.out.println("Injected CreditCardProcessor to BillingService");
        this.creditCardProcessor = creditCardProcessor;
    }

    @Inject
    @Named("transactionLogger1")
    public void setTransactionLogger(TransactionLogger transactionLogger) {
        System.out.println("Injected TransactionLogger to BillingService");
        this.transactionLogger = transactionLogger;
    }

}
