package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    //narzucono nam stworzenie konstruktora

    public Rectangle(int sideLength, int sideLength2, int radius, String shapeName) {
        super(sideLength, sideLength2, radius, shapeName);
    }

    //narzucono nam zaimplementowanie metody obliczającej powierzchnię

    @Override
    public double calculateArea(int sideLength, int sideLength2, int radius) {
        return sideLength * sideLength2;
    }

    //narzucono nam zaimplementowanie metody obliczającej obwód

    @Override
    public double calculateCircumference(int sideLength, int sideLength2, int radius) {
        return sideLength * 2 + sideLength2 *2;
    }

    //dodajemy metody wyświetlające pole i obwód dla zadanych obiektów

    public static void displayParameters(Rectangle anyRectangle) {
        double squareArea = anyRectangle.calculateArea(anyRectangle.getSideLength(), anyRectangle.getSideLength2(), anyRectangle.getRadius());
        double squareCircumference = anyRectangle.calculateCircumference(anyRectangle.getSideLength(), anyRectangle.getSideLength2(), anyRectangle.getRadius());
        String shapeName = anyRectangle.getShapeName();
        System.out.println("");
        System.out.println("This is " + shapeName);
        System.out.println("The area of " + shapeName + " equals " + squareArea);
        System.out.println("The circumference of " + shapeName + " equals " + squareCircumference);
    }
}
