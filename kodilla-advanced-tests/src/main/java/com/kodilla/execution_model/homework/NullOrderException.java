package com.kodilla.execution_model.homework;

import java.lang.reflect.Executable;

public class NullOrderException extends Exception {

    public NullOrderException() {
        super("Create and order first.");
    }
}
