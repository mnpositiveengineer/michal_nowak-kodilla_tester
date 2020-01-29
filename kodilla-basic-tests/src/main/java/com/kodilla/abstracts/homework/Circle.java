package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    //narzucono nam stworzenie konstruktora

    public Circle(int sideLength, int sideLength2, int radius, String shapeName) {
        super(sideLength, sideLength2, radius, shapeName);
    }

    //narzucono nam zaimplementowanie metody obliczającej powierzchnię

    @Override
    public double calculateArea(int sideLength, int sideLength2, int radius) {
        return radius*radius*3.14;
    }

    //narzucono nam zaimplementowanie metody obliczającej obwód

    @Override
    public double calculateCircumference(int sideLength, int sideLength2, int radius) {
        return radius*2*3.14;
    }

    //dodajemy metody wyświetlające pole i obwód dla zadanych obiektów

    public static void displayParameters(Circle anyCircle) {
        double squareArea = anyCircle.calculateArea(anyCircle.getSideLength(), anyCircle.getSideLength2(), anyCircle.getRadius());
        double squareCircumference = anyCircle.calculateCircumference(anyCircle.getSideLength(), anyCircle.getSideLength2(), anyCircle.getRadius());
        String shapeName = anyCircle.getShapeName();
        System.out.println("");
        System.out.println("This is " + shapeName);
        System.out.println("The area of " + shapeName + " equals " + squareArea);
        System.out.println("The circumference of " + shapeName + " equals " + squareCircumference);
    }
}
