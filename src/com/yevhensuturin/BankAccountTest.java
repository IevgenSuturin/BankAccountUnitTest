package com.yevhensuturin;

import static org.junit.Assert.*;

public class BankAccountTest {

    @org.junit.Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @org.junit.Test
    public void withdraw() {
        BankAccount bankAccount = new BankAccount("Tim", "Buchalka", 1000.00);
        double balance = bankAccount.withdraw(200.00, true);
        assertEquals(800.00, balance, 0);
    }

    @org.junit.Test
    public void getBalance() {
        BankAccount bankAccount = new BankAccount("Tim", "Buchalka", 1000.00);
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }
}