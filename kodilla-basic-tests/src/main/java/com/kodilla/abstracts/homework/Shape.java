package com.kodilla.abstracts.homework;

// Będzie to abstrakcyjna klasa dla kształtów.
// Od tej klasy będą powstawć różne kształty.
// Klasa narzuca by stworzyć obiekt o danych parametrach (boki, promień, nazwa) - konstruktor.
// Klasa narzuca by zaimplementować metodę obliczania powierzchni i obwodu.
// Narzucają pewien niekompletny schemat działania.

public abstract class Shape {

    //definiujemy zmienne prywatne

    private int sideLength;
    private int sideLength2;
    private int radius;
    private String shapeName;

    // tworzymy konstruktor

    public Shape (int sideLength, int sideLength2, int radius, String shapeName){
        this.sideLength = sideLength;
        this.sideLength2 = sideLength2;
        this.shapeName = shapeName;
        this.radius = radius;
    }

    //definiujemy gettery do dostania się do zmiennych

    public int getSideLength(){
        return sideLength;
    }
    public int getSideLength2(){
        return sideLength2;
    }
    public int getRadius(){
        return radius;
    }
    public String getShapeName(){
        return shapeName;
    }

    //tworzymy metodę narzucającą obliczenie powierzchni

    public abstract double calculateArea(int sideLength, int sideLength2, int radius);

    //tworzymy metodę narzucającą obliczenie obwodu

    public abstract double calculateCircumference(int sideLength, int sideLength2, int radius);
}
