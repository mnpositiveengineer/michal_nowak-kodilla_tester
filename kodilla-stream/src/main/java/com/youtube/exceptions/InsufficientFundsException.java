package com.youtube.exceptions;

public class InsufficientFundsException extends  Exception {
    public InsufficientFundsException() {
        super("Not enough money dude");
    }
}
