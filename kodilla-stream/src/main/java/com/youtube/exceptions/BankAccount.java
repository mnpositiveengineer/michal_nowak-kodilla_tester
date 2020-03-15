package com.youtube.exceptions;

public class BankAccount {

    private String name;
    private int amount;

    public BankAccount(String name, int amount) {
        if(amount<0){
            throw new RuntimeException("Cannot create with amount less than 0.");
        }

        this.name = name;
        this.amount = amount;
    }

    public void withdrawAmount (int amountToWithdraw) throws Exception {
        if(amount - amountToWithdraw < 0){
            throw new Exception("Not enough money.");
        }
    }

    public void withdrawAmount2 (int amountToWithdraw) throws InsufficientFundsException {
        if(amount - amountToWithdraw < 0){
            throw new InsufficientFundsException();
        }
    }
}
