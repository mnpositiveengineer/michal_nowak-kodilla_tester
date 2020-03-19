package com.kodilla.stream.homework;

import com.youtube.exceptions.InvalidArgumentException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() throws InvalidInputException, InvalidDateException {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Copy documents", LocalDate.of(2020, 03, 02), LocalDate.of(2019, 03, 02)));
        tasks.add(new Task("Finish project", LocalDate.of(2020, 03, 07), LocalDate.of(2020, 03, 10)));
        tasks.add(new Task("Make presentation", LocalDate.of(2020, 03, 11), LocalDate.of(2020, 03, 20)));
        tasks.add(new Task("Make presentation", LocalDate.of(2020, 03, 11), LocalDate.of(2020, 03, 22)));
        return tasks;
    }
}
