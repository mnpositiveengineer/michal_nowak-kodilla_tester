package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GamblingMachineTestSuit {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @Test
    public void ShouldThrowException() throws InvalidNumbersException {
        Set<Integer> userNumbers = new HashSet<>();
        userNumbers.add(1);
        userNumbers.add(2);
        userNumbers.add(3);
        int result = gamblingMachine.howManyWins(userNumbers);
        assertEquals(InvalidNumbersException, result);
    }

//    @ParameterizedTest
//    @CsvFileSource(resources = "/WrongSetOfNumbersToValidate.csv", numLinesToSkip = 0)
//    public void should_Throw_Exception_When_Size_Of_Set_Is_Different_Than_Six_Or_We_Have_Zero_Inside_Or_We_Have_Value_Below_One_Inside(Set<Integer> userNumbers) throws InvalidNumbersException {
//        InvalidNumbersException result = gamblingMachine.howManyWins(userNumbers);
//        Set<Integer> nu
//    }
}
