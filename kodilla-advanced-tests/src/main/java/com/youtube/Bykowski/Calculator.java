package com.youtube.Bykowski;

public class Calculator {

    public int add(int value1, int value2) {
        return value1 + value2;
    }

    public int divide(int value1, int value2) throws ArithmeticException {
        if (value2 != 0) {
            return value1/value2;
        } else {
            throw new ArithmeticException("You cannot divide by 0! Try again.");
        }
    }
}
