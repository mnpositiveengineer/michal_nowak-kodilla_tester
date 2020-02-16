package com.kodilla.abstracts.homework;

import static com.kodilla.abstracts.homework.Parameters.displayParameters;

public class Application {
    public static void main(String[] args) {

        //utwórzmy obiekty na podstawie klasy Square

        Shape square1 = new Square(20);
        displayParameters(square1);
        Shape square2 = new Square(80);
        displayParameters(square2);
        Shape square3 = new Square(10);
        displayParameters(square3);

        //tworzę nowe obiekty na podstawie klasy Rectangle

        Rectangle rectangle1 = new Rectangle(10, 20);
        displayParameters(rectangle1);
        Rectangle rectangle2 = new Rectangle(17, 13);
        displayParameters(rectangle2);
        Rectangle rectangle3 = new Rectangle(1,90);
        displayParameters(rectangle3);

        //tworzę nowe obiekty na podstawie klasy Circle

        Circle circle1 = new Circle(10);
        displayParameters(circle1);
        Circle circle2 = new Circle(20);
        displayParameters(circle2);
        Circle circle3 = new Circle(30);
        displayParameters(circle3);
    }
}
