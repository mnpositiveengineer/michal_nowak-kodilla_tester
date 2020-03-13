package com.kodilla.parametrized_tests.homework_BMI;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.Assert.*;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#verySeverelyUnderweightPeople")
    public void ShouldIndicateVerySevereUnderweight(Person person){
        String result = person.getBMI(person);
        assertEquals("Very severely underweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#severelyUnderweightPeople")
    public void ShouldIndicateSevereUnderweight(Person person){
        String result = person.getBMI(person);
        assertEquals("Severely underweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#UnderweightPeople")
    public void ShouldIndicateUnderweight(Person person){
        String result = person.getBMI(person);
        assertEquals("Underweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#NormalPeople")
    public void ShouldIndicateNormal(Person person){
        String result = person.getBMI(person);
        assertEquals("Normal (healthy weight)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#OverweightPeople")
    public void ShouldIndicateOverweight(Person person){
        String result = person.getBMI(person);
        assertEquals("Overweight", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#ObeseClass1")
    public void ShouldIndicateObeseClassOne(Person person){
        String result = person.getBMI(person);
        assertEquals("Obese Class I (Moderately obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#ObeseClass2")
    public void ShouldIndicateObeseClassTwo(Person person){
        String result = person.getBMI(person);
        assertEquals("Obese Class II (Severely obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#ObeseClass3")
    public void ShouldIndicateObeseClassThree(Person person){
        String result = person.getBMI(person);
        assertEquals("Obese Class III (Very severely obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#ObeseClass4")
    public void ShouldIndicateObeseClassFour(Person person){
        String result = person.getBMI(person);
        assertEquals("Obese Class IV (Morbidly Obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#ObeseClass5")
    public void ShouldIndicateObeseClassFive(Person person){
        String result = person.getBMI(person);
        assertEquals("Obese Class V (Super Obese)", result);
    }

    @ParameterizedTest
    @MethodSource (value = "com.kodilla.parametrized_tests.homework_BMI.SourceOfMethod#ObeseClass6")
    public void ShouldIndicateObeseClassSix(Person person){
        String result = person.getBMI(person);
        assertEquals("Obese Class VI (Hyper Obese)", result);
    }

}