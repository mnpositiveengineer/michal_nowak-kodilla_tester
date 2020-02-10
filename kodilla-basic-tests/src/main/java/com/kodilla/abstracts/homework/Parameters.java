package com.kodilla.abstracts.homework;


public class Parameters {
    public static void displayParameters(Shape anyShape) {
        double area = anyShape.calculateArea();
        double circumference = anyShape.calculateCircumference();
        String shapeName = anyShape.getShapeName();
        System.out.println("");
        System.out.println("This is " + shapeName);
        System.out.println("The area of " + shapeName + " equals " + area);
        System.out.println("The circumference of " + shapeName + " equals " + circumference);
    }
}
