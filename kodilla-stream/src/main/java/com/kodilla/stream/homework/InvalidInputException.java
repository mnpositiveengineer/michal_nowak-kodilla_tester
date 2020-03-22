package com.kodilla.stream.homework;

public class InvalidInputException extends Exception {

    public InvalidInputException() {
        super("Wrong value. Try again.");
    }
}
