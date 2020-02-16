package com.kodilla.abstracts.homework;


public class Parameters {
    public static void displayParameters(Shape anyShape) {
        double area = anyShape.calculateArea();
        double circumference = anyShape.calculateCircumference();
        System.out.println("");
        System.out.println("This is " + getShapeName(anyShape));
        System.out.println("The area of this " + getShapeName(anyShape) + " equals " + area);
        System.out.println("The circumference of this " + getShapeName(anyShape) + " equals " + circumference);
    }

    public static String getShapeName(Shape anyShape){
        if (anyShape instanceof Square)
            return "Square";
        else if (anyShape instanceof Rectangle)
            return  "Rectangle";
        else if (anyShape instanceof Circle)
            return "Circle";
        else
            return "There is no such shape";
    }
}
