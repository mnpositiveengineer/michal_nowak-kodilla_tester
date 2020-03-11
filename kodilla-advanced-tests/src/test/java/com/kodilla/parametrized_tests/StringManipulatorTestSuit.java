package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringManipulatorTestSuit {

    StringManipulator stringManipulator = new StringManipulator();

    @ParameterizedTest
    @CsvFileSource(resources = "/stringWithLowerCase.csv", numLinesToSkip = 1)
    public void ShouldReverseStringWithLowerCase(String input, String expected){
        assertEquals(expected ,stringManipulator.reverseWithLowerCase(input));
    }

    @ParameterizedTest
    @CsvSource(value = {"test, 4", "OTHer,5", "E V E n t,5", "null, 4", "A,1"})
    public void ShouldCalculateStringLengthWithoutSpaces(String input, int expected){
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));

    }
}
