package com.github.pkosmowski.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext(
                new String[]{"spring.xml"}
        );

        BankingApp bankingApp = context.getBean("bankingApp", BankingApp.class);
        System.out.println("bankingApp account balance= " + bankingApp.getAccountBalance());
    }

    public static class BankingApp {

        double accountBalance = 100;

        public double getAccountBalance() {
            return accountBalance;
        }
    }
}
