package org.lessons.java.oop_snacks_1;

import java.math.BigDecimal;

public class BankAccount {

    private int accountNumber;
    private BigDecimal balance;

    public BankAccount(int accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = new BigDecimal(0);
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void depositMoney(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(0)) == 1) {
            this.balance = this.balance.add(amount);
        } else {
            System.out.println("Insert a positive value to deposit.");
        }
    }

    public void withDrawMoney(BigDecimal amount) {
        if (amount.compareTo(new BigDecimal(0)) == 1) {
            if (balance.compareTo(amount) == 0 || balance.compareTo(amount) == 1) {
                balance = balance.subtract(amount);
            } else {
                System.out.println("No enough balance.");
            }
        } else {
            System.out.println("Insert a positive value to withdraw.");
        }
    }

    public BigDecimal getBalance() {
        return this.balance;
    }
}