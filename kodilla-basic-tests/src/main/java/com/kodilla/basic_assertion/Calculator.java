package com.kodilla.basic_assertion;

import static java.lang.StrictMath.pow;

public class Calculator {
    public int adding(int firstNumber, int secondNumber){
        return (int) Math.addExact(firstNumber, secondNumber);
    }
    public int subtraction(int firstNumber, int secondNumber){
        return (int) Math.subtractExact(firstNumber, secondNumber);
    }
    public int square(int number1, int number2){
        return (int) Math.pow(number1, number2);
    }
}
