package com.github.kospiotr.spring;

import org.springframework.stereotype.Component;

/**
 *
 * @author Piotr
 */
@Component
public class TransactionLogger {

    public TransactionLogger() {
        System.out.println("Constructed TransactionLogger");
    }

    public void logTransaction(Payment transactionToBeLogged) {
        System.out.println("Logging payment of amount: " + transactionToBeLogged.getAmount() + " \n"
                + "  from: " + transactionToBeLogged.getAccountFrom() + "\n"
                + "    to: " + transactionToBeLogged.getAccountTo());
    }

}
