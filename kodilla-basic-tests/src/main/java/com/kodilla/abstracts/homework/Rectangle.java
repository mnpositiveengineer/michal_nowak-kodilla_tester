package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int sideLength;
    private int sideLength2;

    public Rectangle (int sideLength, int sideLength2){
        this.sideLength = sideLength;
        this.sideLength2 = sideLength2;
    }

    //narzucono nam zaimplementowanie metody obliczającej powierzchnię

    public double calculateArea() {
        return this.sideLength * this.sideLength2;
    }

    //narzucono nam zaimplementowanie metody obliczającej obwód

    public double calculateCircumference() {
        return this.sideLength * 2 + this.sideLength2 *2;
    }
}
