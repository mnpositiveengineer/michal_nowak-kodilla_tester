package com.kodilla.stream.homework;

import jdk.vm.ci.meta.Local;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Learn Java", LocalDate.of(2020, 1, 1), LocalDate.of(2020,5,1)));
        tasks.add(new Task("Learn C++", LocalDate.of(2019, 12, 1), LocalDate.of(2020,4,1)));
        tasks.add(new Task("Learn SQL", LocalDate.of(2020, 2, 20), LocalDate.of(2020,3,20)));
        tasks.add(new Task("Learn HTML", LocalDate.of(2019, 10, 1), LocalDate.of(2019,11,30)));
        tasks.add(new Task("Learn CSS", LocalDate.of(2019, 10, 10), LocalDate.of(2019,11,30)));
        return tasks;
    }
}
