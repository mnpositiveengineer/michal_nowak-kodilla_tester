package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Circle;
import com.kodilla.collections.interfaces.Shape;
import com.kodilla.collections.interfaces.Square;
import com.kodilla.collections.interfaces.Triangle;

import java.util.LinkedList;
import java.util.List;


public class GeneralShapesListApplication {
    public static void main(String[] args) {
        List<Shape> shapes = new LinkedList<>();
        Shape square = new Square(11);
        shapes.add(square);
        shapes.add(new Square(10));
        shapes.add(new Circle(7));
        shapes.add(new Triangle(10, 4, 10.77));
        System.out.println(shapes.size());

        shapes.remove(1);
        shapes.remove(square);
        System.out.println(shapes.size());

        Shape triangle = new Triangle(10,4,10.77);
        shapes.remove(triangle);

        for (Shape figure : shapes){
            System.out.println(figure + " " + figure.getArea() + " " + figure.getPerimeter());
        }
    }
}
