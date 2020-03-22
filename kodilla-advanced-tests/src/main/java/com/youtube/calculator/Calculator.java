package com.youtube.calculator;

import java.util.List;
//Calculator is SUT (Service under tests)
//but we need result from CalculationInTheCloud - Dependency class

public class Calculator {

    CalculationInTheCloud calculationInTheCloud;

    public Calculator (CalculationInTheCloud calculationInTheCloud) {
        this.calculationInTheCloud = calculationInTheCloud;
    }

    public double calculator(List<Double> anyList) {
        double someValue = calculationInTheCloud.CalculateSomeComplicatedValues(anyList);
        double result = 2.0* someValue;
        return result;
    }
}
