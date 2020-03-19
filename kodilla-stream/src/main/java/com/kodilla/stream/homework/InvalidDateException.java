package com.kodilla.stream.homework;

public class InvalidDateException extends Exception {
    public InvalidDateException() {
        super ("You entered the wrong dates. Deadline must be after opened date.");
    }
}
