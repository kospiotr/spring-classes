package com.github.kospiotr.spring;

/**
 *
 * @author Piotr
 */
public class Payment {

    private String paymentTitle;
    private String accountFrom;
    private String accountTo;
    private double amount;

    public Payment() {
    }

    public Payment(String paymentTitle, String accountFrom, String accountTo, double amount) {
        this.paymentTitle = paymentTitle;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
    }

    public String getPaymentTitle() {
        return paymentTitle;
    }

    public void setPaymentTitle(String paymentTitle) {
        this.paymentTitle = paymentTitle;
    }

    public String getAccountFrom() {
        return accountFrom;
    }

    public void setAccountFrom(String accountFrom) {
        this.accountFrom = accountFrom;
    }

    public String getAccountTo() {
        return accountTo;
    }

    public void setAccountTo(String accountTo) {
        this.accountTo = accountTo;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentTitle=" + paymentTitle + ", accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", amount=" + amount + '}';
    }

}
