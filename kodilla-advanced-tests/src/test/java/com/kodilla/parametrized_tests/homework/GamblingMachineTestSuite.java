package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;


public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @Test
    public void ShouldReturnExceptionWhenSetOfNumbersAreInvalid() throws InvalidNumbersException {
        //GIVEN
        Set<Integer> invalidSet = new HashSet<>();
        invalidSet.add(1);
        invalidSet.add(2);
        invalidSet.add(3);
        //WHEN
        try {
            int result = gamblingMachine.howManyWins(invalidSet);
        } catch (InvalidNumbersException e) {
            assertEquals("Wrong numbers provided", e.getMessage());
        }
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongSetOfNumbersToValidate.csv", numLinesToSkip = 0)
    public void ShouldReturnExceptionWhenSetOfNumbersGivenInSourceFileAreInvalid(String string) throws InvalidNumbersException {

        String[] splitedString = string.split(" ");

        Set<Integer> invalidSets = new HashSet<>();

        for (String number : splitedString){
           invalidSets.add(Integer.parseInt(number));
        }

        try {
            gamblingMachine.howManyWins(invalidSets);
        } catch (InvalidNumbersException e) {
            assertEquals("Wrong numbers provided", e.getMessage());
        }
    }
    @ParameterizedTest
    @CsvFileSource(resources = "/CorrectSetOfNumbersToValidate.csv", numLinesToSkip = 0)
    public void ShouldReturnTrueWhenSetOfNumbersGivenInSourceFileAreValid(String string) throws InvalidNumbersException {

        String[] splitedString = string.split(" ");

        Set<Integer> validSets = new HashSet<>();

        for (String number : splitedString){
            validSets.add(Integer.parseInt(number));
        }

        int counted = gamblingMachine.howManyWins(validSets);
        boolean result = counted >=0 && counted <=6;
        assertTrue(result);
    }

    @ParameterizedTest
    @MethodSource
    public void ShouldReturnExceptionWhenSetOfNumbersGivenInMethodAreInvalid(Set<Integer> invalidSet) {
        try {
            gamblingMachine.howManyWins(invalidSet);
        } catch (InvalidNumbersException e) {
            assertEquals("Wrong numbers provided", e.getMessage());
        }
    }

    @ParameterizedTest
    @MethodSource
    public void ShouldReturnTrueWhenSetOfNumbersGivenInMethodAreValid(Set<Integer> validSet) throws InvalidNumbersException {
        int counted = gamblingMachine.howManyWins(validSet);
        boolean result = counted >=0 && counted <=6;
        assertTrue(result);
    }

    private static Stream<Arguments> ShouldReturnExceptionWhenSetOfNumbersGivenInMethodAreInvalid(){
        return Stream.of(
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5))),
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7))),
                Arguments.of(new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5))),
                Arguments.of(new HashSet<>(Arrays.asList(-1, 1, 2, 3, 4, 5)))
        );
    }

    private static Stream<Arguments> ShouldReturnTrueWhenSetOfNumbersGivenInMethodAreValid(){
        return Stream.of(
                Arguments.of(new HashSet<>(Arrays.asList(1, 2, 3, 4, 5 ,6))),
                Arguments.of(new HashSet<>(Arrays.asList(44, 45, 46, 47, 48 ,49)))
        );
    }

}