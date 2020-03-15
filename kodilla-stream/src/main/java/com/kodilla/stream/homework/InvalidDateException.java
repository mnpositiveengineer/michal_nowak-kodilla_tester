package com.kodilla.stream.homework;

public class InvalidDateException extends Exception {
    public InvalidDateException() {
        super ("Deadline must be after opened date.");
    }
}
