package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> deadlines = TaskRepository.getTasks()
                .stream()
                .filter(TaskManager :: checkDate)
                .map(TaskManager :: getDeadline)
                .collect(Collectors.toList());
        System.out.println(deadlines);
    }
    public static boolean checkDate(Task task){
        LocalDate myDate = task.getDeadline();
        LocalDate currentDay = LocalDate.now();
        if (myDate.isAfter(currentDay)) {
            return true;
        } else {
            return false;
        }
    }
    public static LocalDate getDeadline(Task task){
        return task.getDeadline();
    }
}
