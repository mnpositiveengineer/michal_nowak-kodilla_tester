package com.kodilla.inheritance.homework;

import java.util.ArrayList;

public class OperatingSystem {

    //tworzę zmienną rok wydania systemu operacyjnego

    private int year;

    //tworzę konstruktor klasy

    public OperatingSystem(int year){
        this.year = year;
    }

    //tworzę metodę 1

    public void turnOn(){
        System.out.println("Operating system is turned on.");
    }

    //tworzę metodę 2

    public void turnOff(){
        System.out.println("Operating system is turned off.");
    }

    //tworzę metodę pokazującą rok

    public void displayYear(){
        System.out.println("Operating system year: " + year);
    }
    public int getYear(){
        return year;
    }
}
