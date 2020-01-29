package com.kodilla.abstracts.homework;

public class Square extends Shape {

    //narzucono nam stworzenie konstruktora

    public Square(int sideLength, int sideLength2, int radius, String shapeName) {
        super(sideLength, sideLength2, radius, shapeName);
    }

    //narzucono nam zaimplementowanie metody obliczającej powierzchnię

    @Override
    public double calculateArea(int sideLength, int sideLength2, int radius) {
        return sideLength * sideLength;
    }

    //narzucono nam zaimplementowanie metody obliczającej obwód

    @Override
    public double calculateCircumference(int sideLength, int sideLength2, int radius){
        return sideLength * 4;
    }

    //dodajemy metody wyświetlające pole i obwód dla zadanych obiektów

    public static void displayParameters(Square anySquare) {
        double squareArea = anySquare.calculateArea(anySquare.getSideLength(), anySquare.getSideLength2(), anySquare.getRadius());
        double squareCircumference = anySquare.calculateCircumference(anySquare.getSideLength(), anySquare.getSideLength2(), anySquare.getRadius());
        String shapeName = anySquare.getShapeName();
        System.out.println("");
        System.out.println("This is " + shapeName);
        System.out.println("The area of " + shapeName + " equals " + squareArea);
        System.out.println("The circumference of " + shapeName + " equals " + squareCircumference);
    }
}
