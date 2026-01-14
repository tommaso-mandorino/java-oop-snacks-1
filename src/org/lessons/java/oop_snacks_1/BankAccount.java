package org.lessons.java.oop_snacks_1;

import java.math.BigDecimal;

public class BankAccount {

    private int accountNumber;
    private BigDecimal balance;

    BankAccount(BigDecimal accountNumber) {
        this.balance = new BigDecimal(0);
    }

    public void depositMoney(BigDecimal amount) {
        this.balance = this.balance.add(amount);
    }

    public void withDrawMoney(BigDecimal amount) {
        if(balance.compareTo(amount) == 0 || balance.compareTo(amount) == 1) {
            balance = balance.subtract(amount);
        } else {
            System.out.println("No enough balance.");
        }
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}