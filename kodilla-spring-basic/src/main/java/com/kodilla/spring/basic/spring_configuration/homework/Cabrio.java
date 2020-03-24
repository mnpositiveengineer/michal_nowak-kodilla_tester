package com.kodilla.spring.basic.spring_configuration.homework;

public class Cabrio implements Car {

    public boolean hasHeadlightsTurnedOn(int time) {
        if (time >= 20 || time <= 6) {
            System.out.println("Lights are turned on!");
            return true;
        } else {
            System.out.println("Lights are turned off!");
            return false;
        }
    }

    @Override
    public String getCarType() {
        return "Car Type - Cabrio.";
    }
}
