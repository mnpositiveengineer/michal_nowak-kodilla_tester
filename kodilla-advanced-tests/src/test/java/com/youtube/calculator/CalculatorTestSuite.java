package com.youtube.calculator;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTestSuite {

    @Test
    public void ShouldReturnTen() {
        CalculationInTheCloud calculationInTheCloud = Mockito.mock(CalculationInTheCloud.class);
        Calculator calculator = new Calculator(calculationInTheCloud);
        Mockito.when(calculationInTheCloud.CalculateSomeComplicatedValues(Arrays.asList(2.5,2.5))).thenReturn(5.0);
        List<Double> anyList = Arrays.asList(2.5,2.5);
        Double result = calculator.calculator(anyList);
        assertEquals(10, result, 0.01);
    }

    @Test
    public void ShouldUseCloudBasedService() {
        CalculationInTheCloud calculationInTheCloud = Mockito.mock(CalculationInTheCloud.class);
        Calculator calculator = new Calculator(calculationInTheCloud);
        calculator.calculator(null);
        Mockito.verify(calculationInTheCloud, Mockito.times(1)).CalculateSomeComplicatedValues(null);
    }

    @Test
    public void ShouldVerify() {
        CalculationInTheCloud calculationInTheCloud = Mockito.mock(CalculationInTheCloud.class);
        Mockito.verify(calculationInTheCloud);
    }

}