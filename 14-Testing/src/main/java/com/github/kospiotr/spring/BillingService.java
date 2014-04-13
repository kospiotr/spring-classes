package com.github.kospiotr.spring;

import javax.inject.Inject;
import org.springframework.stereotype.Component;

/**
 *
 * @author Piotr
 */
@Component
public class BillingService {

    @Inject
    private CreditCardProcessor creditCardProcessor;

    @Inject
    private TransactionLogger transactionLogger;

    public BillingService() {
        System.out.println("Constructed BillingService");
    }

    public BillingService(CreditCardProcessor creditCardProcessor, TransactionLogger transactionLogger) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLogger = transactionLogger;
        System.out.println("Constructed BillingService, and injected CreditCardProcessor and TransactionLogger");
    }

    public boolean processPayment(Payment payment) {
        boolean processed = creditCardProcessor.processPayment(payment);
        boolean logged = transactionLogger.logTransaction(payment);
        return processed && logged;
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
