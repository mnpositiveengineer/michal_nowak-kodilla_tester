package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.adding(a, b);
        assertEquals(13, sumResult);
    }
    @Test
    public void testSubtraction(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subtractionResult = calculator.subtraction(a, b);
        assertEquals(-3, subtractionResult);
    }
    @Test
    public void testSquare(){
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 2;
        int squareResult = calculator.square(a, b);
        assertEquals(25, squareResult);
    }
}
