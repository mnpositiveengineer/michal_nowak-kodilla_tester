package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int sideLength;

    public Square (int sideLength){
        this.sideLength = sideLength;
    }

    //narzucono nam zaimplementowanie metody obliczającej powierzchnię

    public double calculateArea() {
        return this.sideLength * this.sideLength;
    }

    //narzucono nam zaimplementowanie metody obliczającej obwód

    public double calculateCircumference(){
        return this.sideLength * 4;
    }

    //dodajemy metody wyświetlające pole i obwód dla zadanych obiektów
}
