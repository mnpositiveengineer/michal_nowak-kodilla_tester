package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.*;

public class GamblingMachineTestSuite {

    GamblingMachine gamblingMachine = new GamblingMachine();

    @Test
    public void ShouldReturnExceptionWhenSetOfNumbersAreInvalid() throws InvalidNumbersException {
        //GIVEN
        Set<Integer> invalidSet = new HashSet<>();
        invalidSet.add(1);
        invalidSet.add(2);
        invalidSet.add(3);
        //THEN
        try {
            int result = gamblingMachine.howManyWins(invalidSet);
        } catch (InvalidNumbersException e) {
            System.out.println("Wrong numbers provided");
        } finally {
            System.out.println("Test returns Exception.");
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
            System.out.println("Wrong numbers provided");
        } finally {
            System.out.println("Tests return Exception.");
        }
    }
}