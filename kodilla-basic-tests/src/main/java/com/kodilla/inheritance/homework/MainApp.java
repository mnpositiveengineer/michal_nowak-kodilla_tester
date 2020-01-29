package com.kodilla.inheritance.homewor;

public class MainApp {
    public static void main(String[] args){

        //tworzę obiekty na podstawie 3 klas

        OperatingSystem normalSystem = new OperatingSystem(2019);
        Crackdown crashedSystem = new Crackdown(2010);
        Openfiles openedSystem = new Openfiles(2018);

        //Wyświeltam rok produkcji poszczególnych obiektów i metod informujące o włączeniu/wyłączeniu.

        normalSystem.displayYear();
        normalSystem.turnOn();
        normalSystem.turnOff();
        crashedSystem.displayYear();
        crashedSystem.turnOn();
        openedSystem.displayYear();
        openedSystem.turnOff();
    }

}
