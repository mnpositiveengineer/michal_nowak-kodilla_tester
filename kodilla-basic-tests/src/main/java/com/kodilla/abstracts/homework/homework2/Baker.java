package com.kodilla.abstracts.homework.homework2;

public class Baker extends Job {
    public Baker(int salary, String firstName, int age, String job) {
        super(salary = 5000, firstName, age, job);
    }

    @Override
    public void showResponsibilites() {
        System.out.println("- Bake a bread.");
        System.out.println("- Bake rolls");
        System.out.println("- Bake donuts");
        System.out.println("- Bake donuts");
    }
    public void displayIntro(Baker object){
        System.out.println(object.firstName + " is " + object.age + " and he is a " + object.job + ". He earns " + object.salary);
        System.out.println("His responsibilities are:");
    }
}
