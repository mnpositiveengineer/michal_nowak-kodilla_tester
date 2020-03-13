package com.youtube;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = getPeople();

// ZADANIE 1: Z LISTY WYBIERZ SAME KOBIETY I POKAŻ JE NA EKRANIE/WRZUĆ DO LISTY, KTÓRĄ POKAŻESZ NA EKRANIE.

// 1. PODEJŚCIE NA PIECHOTĘ
        List<Person> females = new ArrayList<>();
        for(Person person : people) {
            if (person.getGender() == Gender.FEMALE) {
                females.add(person);
            }
        }
        System.out.println(females);
        System.out.println("-------------------------------");
        females.forEach(System.out :: println);
        System.out.println("-------------------------------");

// 2. PODEJŚCIE ZA POMOCĄ STREAMA
                people.stream()
                .filter(u -> u.getGender().equals(Gender.FEMALE))
                .forEach(u-> System.out.println(u));

        System.out.println("-------------------------------");

                List<Person> femalesFromStream = people.stream()
                        .filter(u -> u.getGender().equals(Gender.FEMALE))
                        .collect(Collectors.toList());
        System.out.println(femalesFromStream);

        System.out.println("-------------------------------");

        // ZADANIE 2: POSORTUJ DANE W KOLEKCJI PO AGE
        List<Person> sorted = people.stream()
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .collect(Collectors.toList());
        sorted.forEach(System.out :: println);

        System.out.println("-------------------------------");

        people.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .forEach(System.out :: println);

        // ZADANIE 3: SPRAWDZAMY CZY WSZYSTKIE OSOBY Z LISTY MAJĄ WIEK POWYŻEJ 5 ROKU

        boolean checkIfEveryFromListIsAboveFive = people.stream()
                .allMatch(person -> person.getAge() > 5);
        System.out.println(checkIfEveryFromListIsAboveFive);

        // ZADANIE 4: SPRAWDZAMY CZY KTÓRAŚ Z OSÓB Z LISTY MA WIEK POWYŻEJ 5 ROKU

        boolean checkIfSomeoneFromListIsAboveOneHundred = people.stream()
                .anyMatch(person -> person.getAge() > 100);
        System.out.println(checkIfSomeoneFromListIsAboveOneHundred);

        // ZADANIE 5: SPRAWDZAMY CZY ŻADNA Z OSÓB NIE MA WIĘCEJ NIŻ 120 LAT

        boolean checkIfThereIsNoPersonAbove120 = people.stream()
                .noneMatch(person -> person.getAge() > 120);
        System.out.println(checkIfThereIsNoPersonAbove120);

        // ZADANIE 6: SPRAWDZAMY CZY ŻADNA Z OSÓB NIE MA NA IMIĘ ANTONIO

        boolean checkIfAnyPersonDoesNotHaveNameAntonio = people.stream()
                .noneMatch(person -> person.getName().equals("Antonio"));
        System.out.println(checkIfAnyPersonDoesNotHaveNameAntonio);

        // ZADANIE 7: SPRAWDZAMY KTÓRA Z OSÓB JEST NAJSTARSZA

        Optional<Person> theOldestPerson = people.stream()
                .max(Comparator.comparing(Person::getAge));

        System.out.println(theOldestPerson);

        System.out.println("-------------------------------");

        people.stream()
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(person -> System.out.println(person.getName()));

        // ZADANIE 8: SPRAWDZAMY KTÓRY Z MĘŻCZYZN JEST NAJSTARSZY

        people.stream()
                .filter(u -> u.getGender().equals(Gender.MALE))
                .max(Comparator.comparing(Person::getAge))
                .ifPresent(person -> System.out.println(person.getName()));

        // ZADANIE 9: ZGRUPUJ PO PlCI - DODAJ DO MAPY

        Map<Gender, List<Person>> groupByGender = people.stream()
                .collect(Collectors.groupingBy(Person::getGender));

        System.out.println(groupByGender);
        System.out.println("-------------------------------");
        groupByGender.forEach((gender, people1) -> {
            System.out.println(gender);
            System.out.println(people1);;
        });
    }
    public static List<Person> getPeople(){
        return List.of(
                new Person("James Bond",20, Gender.MALE),
                new Person("Alina Smith",33, Gender.FEMALE),
                new Person("Helen White",57, Gender.FEMALE),
                new Person("Alex Boz",14, Gender.MALE),
                new Person("Jamie Goa",99, Gender.MALE),
                new Person("Anna Cook",7, Gender.FEMALE),
                new Person("Zelda Brown",120, Gender.FEMALE)
        );
    }
}
