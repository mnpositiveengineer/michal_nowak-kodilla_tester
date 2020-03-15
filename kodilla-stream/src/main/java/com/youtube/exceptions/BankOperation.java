package com.youtube.exceptions;

public class BankOperation {

    private int balance;

    public BankOperation(){
        balance = 0;
    }

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) throws InsufficientFundsException {
        if (amount > balance)
            throw new InsufficientFundsException();
        balance = balance - amount;
    }

    public void deposit (int amount){
        balance = balance + amount;
    }
}
