package com.kodilla.abstracts.homework;

public class Circle extends Shape {

    private int radius;

    public Circle (int radius){
        this.radius = radius;
    }

    //narzucono nam zaimplementowanie metody obliczającej powierzchnię

    public double calculateArea() {
        return this.radius*this.radius*3.14;
    }

    //narzucono nam zaimplementowanie metody obliczającej obwód

    public double calculateCircumference() {
        return this.radius*2*3.14;
    }

}
