package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {

        //utwórzmy obiekty na podstawie klasy Square

        Square square1 = new Square(20, 20, 0, "square1");
        square1.displayParameters(square1);
        Square square2 = new Square(80, 80, 0, "square2");
        square2.displayParameters(square2);
        Square square3 = new Square(10, 10, 0, "square3");
        square2.displayParameters(square3);


        //tworzę nowe obiekty na podstawie klasy Rectangle

        Rectangle rectangle1 = new Rectangle(10, 20, 0, "rectangle1");
        rectangle1.displayParameters(rectangle1);
        Rectangle rectangle2 = new Rectangle(17, 13, 0, "rectangle2");
        rectangle1.displayParameters(rectangle2);
        Rectangle rectangle3 = new Rectangle(1, 190, 0, "rectangle3");
        rectangle1.displayParameters(rectangle3);

        //tworzę nowe obiekty na podstawie klasy Circle

        Circle circle1 = new Circle(0, 0, 10, "circle1");
        circle1.displayParameters(circle1);
        Circle circle2 = new Circle(0, 0, 20, "circle2");
        circle1.displayParameters(circle2);
        Circle circle3 = new Circle(0, 0, 30, "circle3");
        circle1.displayParameters(circle3);
    }
}
