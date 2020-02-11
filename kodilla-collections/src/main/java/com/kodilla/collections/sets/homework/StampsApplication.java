package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Szczecin", 23.5, 40, false));
        stamps.add(new Stamp("Poznań", 31.25, 25.25, true));
        stamps.add(new Stamp("Poznań", 31.25, 25.25, true));
        stamps.add(new Stamp("Gdańsk", 23.5, 40, false));
        stamps.add(new Stamp("Kraków", 31.25, 25.25, false));
        stamps.add(new Stamp("Warszawa", 23.5, 40, true));
        stamps.add(new Stamp("Katowice", 31.25, 25.25, true));
        stamps.add(new Stamp("Kraków", 31.25, 25.25, false));

        System.out.println(stamps.size());

        for (Stamp stamp : stamps){
            System.out.println("This stamp is from " + stamp.getStampName() + ". His dimensions are " + stamp.getHeight() + " x " + stamp.getWidth() +".");
        }

    }
}
