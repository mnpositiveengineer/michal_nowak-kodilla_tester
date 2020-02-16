package com.kodilla.abstracts.homework;

public abstract class Shape {

    //narzucamy stworzenie konstruktora

    public Shape(){}

    //tworzymy metodę narzucającą obliczenie powierzchni

    public abstract double calculateArea();

    //tworzymy metodę narzucającą obliczenie obwodu

    public abstract double calculateCircumference();
}
