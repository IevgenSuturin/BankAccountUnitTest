package com.yevhensuturin;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void deposit() {
        BankAccount bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw() {
        BankAccount bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        double balance = bankAccount.withdraw(200.00, true);
        assertEquals(800.00, balance, 0);
    }

    @Test
    public void getBalance() {
        BankAccount bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true(){
        BankAccount bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.SAVINGS);
        assertTrue("Account is not a CHECKING account", bankAccount.isChecking());
    }
}