package com.kodilla.school;

public class Grades{
    private int[] values;
    private int size;

    public Grades(){                  // dlaczego tworzymy tutaj konstruktora? Czy nie moglibyśmy zapisać wartości bazowych (0) przy zmiennych i nie tworzyć konstruktora?
        this.values = new int[0];
        this.size = 0;
    }

    public void add(int value){     // dlaczego ta metoda jest void? Czy nie zwracamy tutaj konkretnej tablicy? Czy nie powinno by int[] wraz z return int[] na końcu?
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);   //dlaczego nie zapisaliśmy tutaj w nawiasie this.values i this.values.length? Czy od momentu stworzenia konstruktora nie powinniśmy się posługiwać już tylko wartościami this.cośtam
        newTab[this.size-1] = value;
        this.values = newTab;
    }

    public int[] getValues(){
        return values;              //dlaczego nie zapisaliśmy tutaj return this.values?
    }

    public double getAverage(){
        double sum = 0;
        for (int i=0; i < this.values.length; i++){
            sum = sum + this.values[i];
        }
        return sum/this.values.length;
    }
}