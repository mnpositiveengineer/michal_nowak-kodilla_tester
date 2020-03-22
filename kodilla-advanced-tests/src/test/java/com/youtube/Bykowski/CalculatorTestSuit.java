package com.youtube.Bykowski;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.rules.ExpectedException;

//podejście BDD (behaviour driven development) - zaczynamy od testów
//najpierw piszemy testy a potem dopiero implementacje. Testy nie przechodzą najpierw

public class CalculatorTestSuit {

    @Test
    public void Should_Add_Two_Numbers () {
        //given (co mamy na starcie)
        Calculator calculator = new Calculator();

        //when (co sie ma stac)
        int result = calculator.add(10,15);

        //then
        Assert.assertEquals(25, result);
    }

    //bardzie praktyczny zapis

    @Test
    public void Should_Add_Two_Numbers_Refactored () {
        //given
        Calculator calculator = new Calculator();
        //then
        Assert.assertEquals(25, calculator.add(10,15));
        Assert.assertEquals(0, calculator.add(-10,10));
        Assert.assertEquals(2, calculator.add(0,2));
    }

    //dobrą praktyką jest stworzenie kontrtestu

    @Test
    public void Should_Not_Add_Two_Numbers () {
        //given
        Calculator calculator = new Calculator();
        //then
        Assert.assertNotEquals(0, calculator.add(10,15));
    }

    @Test
    public void Should_Divide_Two_Numbers () {

    }

    @Test
    public void Should_Throw_Exception_When_Dividing_By_Zero (){
        Calculator calculator = new Calculator();
        try {
            calculator.divide(1,0);
        } catch (ArithmeticException e) {}
    }

    @Test
    public void Should_Throw_Exception_Message_When_Dividing_By_Zero (){
        Calculator calculator = new Calculator();
//        ExpectedException thrown = ExpectedException.none();
        Assertions.assertThrows(ArithmeticException.class, () ->calculator.divide(1,0));
    }
}
