package com.kodilla.abstracts.homework.homework2;

public abstract class Job {
    int salary;
    String firstName;
    int age;
    String job;

    public Job(int salary, String firstName, int age, String job){
        this.salary = salary;
        this.firstName = firstName;
        this.age = age;
        this.job = job;

    }

    public abstract void showResponsibilites();
}
