package com.kodilla.stream.homework;

import com.youtube.exceptions.InvalidArgumentException;

import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Task {
    private String name;
    private LocalDate opened;
    private LocalDate deadline;

    Scanner scanner = new Scanner(System.in);

    public Task(String name, LocalDate opened, LocalDate deadline) throws InvalidDateException, InvalidInputException {
        this.name = name;
        this.opened = opened;
        this.deadline = validateDate(opened, deadline);
    }

    public String getName() {
        return name;
    }

    public LocalDate getOpened() {
        return opened;
    }

    public LocalDate getDeadline() {
        return deadline;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return Objects.equals(name, task.name) &&
                Objects.equals(opened, task.opened) &&
                Objects.equals(deadline, task.deadline);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, opened, deadline);
    }

    private static LocalDate validateDate(LocalDate opened, LocalDate deadline) throws InvalidDateException, InvalidInputException {

        Scanner scanner = new Scanner(System.in);

        if (deadline.isBefore(opened)) {
            throw new InvalidDateException();
        } else if (deadline.equals(opened)) {
            System.out.println("Deadline is the same as Date of Open. Are you sure? - type 1 (for yes) and press enter. If no, type any sign and press enter.");
            try {
                int userAnswer = scanner.nextInt();
                if (userAnswer == 1) {
                    return deadline;
                } else {
                    throw new InvalidInputException();
                }
            } catch (Exception e) {
                throw new InvalidInputException();
            }
        } else {
            return deadline;
        }
    }
}
