package com.kodilla.abstracts.homework;

public class Square extends Shape {

    //narzucono nam stworzenie konstruktora

    public Square(int sideLength, int sideLength2, int radius, String shapeName) {
        super(sideLength, sideLength2, radius, shapeName);
    }

    @Override
    public double calculateArea() {
        return 0;
    }

    @Override
    public double calculateCircumference() {
        return 0;
    }

    //narzucono nam zaimplementowanie metody obliczającej powierzchnię


    public double calculateArea(int sideLength, int sideLength2, int radius) {
        return sideLength * sideLength;
    }

    //narzucono nam zaimplementowanie metody obliczającej obwód


    public double calculateCircumference(int sideLength, int sideLength2, int radius){
        return sideLength * 4;
    }

    //dodajemy metody wyświetlające pole i obwód dla zadanych obiektów

}
