package com.youtube.exceptions;

import org.junit.Test;

import static org.junit.Assert.*;

public class BankOperationTestSuite {

    @Test (expected = InsufficientFundsException.class )
    public void ShouldReturnExceptionWhenWithdrawingInsufficientAmount() throws InsufficientFundsException {
        BankOperation customer = new BankOperation();
        customer.withdraw(100);
    }

}