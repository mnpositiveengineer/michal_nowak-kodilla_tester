package com.kodilla.execution_model.homework;

public class NoOrderInGivenRangeException extends Exception {

    public NoOrderInGivenRangeException(){
        super("There is no order in given range");
    }
}
