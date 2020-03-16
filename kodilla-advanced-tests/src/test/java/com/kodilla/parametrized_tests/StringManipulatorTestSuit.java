package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

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

    @ParameterizedTest
    @MethodSource
    public void ShouldCalculateStringLengthWithoutSpacesUsingMethod(String input, int expected){
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.SourceMethod#ProvideStringForTestingLength")
    public void ShouldCalculateStringLengthWithoutSpacesUsingClassWithMethod(String input, int expected){
        assertEquals(expected, stringManipulator.getStringLengthWithoutSpaces(input));
    }

    private static Stream<Arguments> ShouldCalculateStringLengthWithoutSpacesUsingMethod() {
        return Stream.of(
            Arguments.of("test", 4),
            Arguments.of("OTHer", 5),
            Arguments.of("E V E n t", 5),
            Arguments.of("null", 4),
            Arguments.of("A", 1)
        );
    }
}
