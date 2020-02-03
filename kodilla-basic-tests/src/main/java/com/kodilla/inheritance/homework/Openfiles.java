package com.kodilla.inheritance.homework;

public class Openfiles extends OperatingSystem {

    // tworzę konstruktora dla tej klasy

    public Openfiles(int year){
        super(year);
    }

    // tworzę metodę nadpisującą turnOff

    public void turnOff(){
        System.out.println("Operating system cannot be turned off. Close files first.");
    }

}
