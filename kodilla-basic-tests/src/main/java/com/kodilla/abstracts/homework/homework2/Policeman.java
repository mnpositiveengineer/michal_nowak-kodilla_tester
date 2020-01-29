package com.kodilla.abstracts.homework.homework2;

public class Policeman extends Job {
    public Policeman(int salary, String firstName, int age, String job) {
        super(salary = 7000, firstName, age, job);
    }

    @Override
    public void showResponsibilites() {
        System.out.println("- Hunt murderers.");
        System.out.println("- Hunt smugglers");
        System.out.println("- Hunt thieves");
        System.out.println("- Eat donuts");
    }
    public void displayIntro(Policeman object){
        System.out.println(object.firstName + " is " + object.age + " and he is a " + object.job + ". He earns " + object.salary);
        System.out.println("His responsibilities are:");
    }
}
