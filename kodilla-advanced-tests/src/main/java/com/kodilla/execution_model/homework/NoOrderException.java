package com.kodilla.execution_model.homework;

public class NoOrderException extends Exception {

    public NoOrderException(){
        super("There is no order in given range");
    }
}
