package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class NumberCheckerTestSuit {

    private NumberChecker numberChecker = new NumberChecker();

    @ParameterizedTest
    @ValueSource(ints = {0, 3, 6, -3, -12, 15})
    public void shouldReturnFalseForNumberDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertTrue(result);
    }
    @ParameterizedTest
    @ValueSource(ints = {-2, -1, 1, 2, 4, 5})
    public void shouldNotReturnFalseForNumberDivisibleByThree(int number){
        boolean result = numberChecker.isDivisibleByThree(number);
        assertFalse(result);
    }
}
