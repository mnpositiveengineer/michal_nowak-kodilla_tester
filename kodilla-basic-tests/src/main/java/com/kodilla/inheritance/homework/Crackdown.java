package com.kodilla.inheritance.homework;

public class Crackdown extends OperatingSystem {

    // tworzę konstruktora dla tej klasy

    public Crackdown(int year){
        super(year);
    }

    // tworzę metodę nadpisującą turnON

    public void turnOn(){
        System.out.println("Error. Operating system cannot be turned on");
    }
}

