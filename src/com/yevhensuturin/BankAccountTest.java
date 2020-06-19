package com.yevhensuturin;

import org.junit.*;

import static org.junit.Assert.*;

public class BankAccountTest {
    private BankAccount bankAccount;
    private static int count;

    @BeforeClass
    public static void beforeClass(){
        System.out.println("This executes before any test cases. Count = " + count++);

    }

    @Before
    public void setup() throws Exception{
        bankAccount = new BankAccount("Tim", "Buchalka", 1000.00, BankAccount.CHECKING);
        System.out.println("Running before each test ...");
    }

    @Test
    public void deposit()  throws Exception {
        double balance = bankAccount.deposit(200.00, true);
        assertEquals(1200.00, balance, 0);
    }

    @Test
    public void withdraw_branch()  throws Exception {
        double balance = bankAccount.withdraw(600.00, true);
        assertEquals(400.00, balance, 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch()  throws Exception{
        double balance = bankAccount.withdraw(600.00, false);
        assertEquals(400.0, bankAccount.getBalance(), 0);
    }

    @Test
    public void withdraw_notBranch_expected_exception_at_early()  throws Exception{
        try {
            bankAccount.withdraw(600.00, false);
            fail("Should have thown an IllegalArgumentException");
        } catch (IllegalArgumentException e){}
    }

    @Test(expected = IllegalArgumentException.class)
    public void withdraw_notBranch_expected_exception_new_approach()  throws Exception{
            bankAccount.withdraw(600.00, false);
           fail("Should have thown an IllegalArgumentException");
    }


    @Test
    public void getBalance() throws Exception {
        bankAccount.deposit(200.00, true);
        assertEquals(1200.00, bankAccount.getBalance(), 0);
    }

    @Test
    public void isChecking_true() throws Exception {
        assertTrue("Account is not a CHECKING account", bankAccount.isChecking());
    }

    @AfterClass
    public static void afterClass() throws Exception {
        System.out.println("This executes after any test cases. Count = " + count++);
    }

    @After
    public void tearDown(){
        System.out.println("Count = "+ count++);
    }

}