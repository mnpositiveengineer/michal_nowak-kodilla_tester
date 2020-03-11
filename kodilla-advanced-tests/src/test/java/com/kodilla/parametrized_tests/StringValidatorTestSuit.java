package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StringValidatorTestSuit {

    StringValidator stringValidator = new StringValidator();

    @ParameterizedTest
    @ValueSource(strings = {"", "   "})
    public void ShouldReturnTrueIfValueIsEmpty(String value){
        assertTrue(stringValidator.isBlank(value));
    }

    @ParameterizedTest
    @NullSource
    public void ShouldReturnTrueIfValueIsNul(String value){
        assertTrue(stringValidator.isBlank(value));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void ShouldReturnTrueIfValueIsNullOrEmpty(String value){
        System.out.println("|" + value  + "|");
        assertTrue(stringValidator.isBlank(value));
    }


}
