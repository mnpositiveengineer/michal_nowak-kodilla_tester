package com.youtube.exceptions;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class BankOperationTestSuite {

    //TESTOWANIE CZY WYRZUCI WYJĄTEK

    @Test (expected = InsufficientFundsException.class )
    public void ShouldReturnExceptionWhenWithdrawingInsufficientAmount() throws InsufficientFundsException {
        BankOperation customer = new BankOperation();
        customer.withdraw(100);
    }

    //TESTOWANIE CZY WYRZUCI WIADOMOŚĆ ZWIĄZNĄ Z WYJĄTKIEM (WIADOMOŚĆ Z CUSTOM EXCEPTION)

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void ShouldReturnExceptionMessageWhenWithdrawingInsufficientAmount() throws InsufficientFundsException {
        thrown.expectMessage("Not enough money dude");
        BankOperation customer = new BankOperation();
        customer.withdraw(100);
    }

}