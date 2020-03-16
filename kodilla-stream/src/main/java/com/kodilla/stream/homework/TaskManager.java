package com.kodilla.stream.homework;

import com.youtube.exceptions.InvalidArgumentException;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        try {
            List<LocalDate> deadlines = TaskRepository.getTasks()
                    .stream()
                    .map(u -> u.getDeadline())
                    .filter(u -> u.isAfter(LocalDate.now()))
                    .collect(Collectors.toList());
            System.out.println(deadlines);

        } catch (InvalidDateException | InvalidInputException e){
            System.out.println(e.getMessage());
        }
    }
}
