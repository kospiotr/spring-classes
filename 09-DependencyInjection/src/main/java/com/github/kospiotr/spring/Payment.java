package com.github.kospiotr.spring;

import java.time.LocalDateTime;
import java.util.Set;

/**
 *
 * @author Piotr
 */
public class Payment {

    private String paymentTitle;
    private String accountFrom;
    private String accountTo;
    private double amount;
    private LocalDateTime date;
    private Set<String> metadata;

    public Payment(String paymentTitle, String accountFrom, String accountTo, double amount, LocalDateTime date, Set<String> metadata) {
        this.paymentTitle = paymentTitle;
        this.accountFrom = accountFrom;
        this.accountTo = accountTo;
        this.amount = amount;
        this.date = date;
        this.metadata = metadata;
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

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Set<String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Set<String> metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "Payment{" + "paymentTitle=" + paymentTitle + ", accountFrom=" + accountFrom + ", accountTo=" + accountTo + ", amount=" + amount + ", date=" + date + ", metadata=" + metadata + '}';
    }

}
