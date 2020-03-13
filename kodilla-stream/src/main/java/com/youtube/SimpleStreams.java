package com.youtube;

import javax.crypto.spec.PSource;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SimpleStreams {
    public static void main(String[] args) {

//ZADANIE 1: WYŚWIETL LICZBY OD 1 DO 9

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("----------------------");

        IntStream
                .range(1, 10)
                .forEach(System.out::println);

// ZADANIE 2: WYŚWIETL LICZBY OD 1 DO 9 Z POMINIĘCIEM 5 PIERWSZYCH LICZB

        System.out.println("----------------------");

        IntStream
                .range(1, 10)
                .skip(5)
                .forEach(U -> System.out.println(U));

// ZADANIE 3: Z UŻYCIEM STREAM.OF POSORTUJ WARTOŚCI WEJŚCIOWE A NASTĘNIE PODAJ PIERWSZĄ Z WARTOŚCI
        System.out.println("----------------------");

        Stream.of(20, 31, 40, 67, 12, 11, 13)
                .sorted()
                .findFirst()
                .ifPresent(System.out :: println);

// ZADANIE 4: Z UŻYCIEM STREAM.Of POSORTUJ WARTOŚCI WEJŚCIOWE OD NAJWIĘKSZEJ DO NAJMNIEJSZEJ
        System.out.println("----------------------");

        Stream.of(20, 31, 40, 67, 12, 11, 13)
                .sorted()
                .sorted(Comparator.comparing(Integer::byteValue).reversed())
                .forEach(System.out :: println);

// ZADANIE 5: POKAŻ TYLKO IMIONA ZACZYNAJĄCE SIĘ NA LITERĘ S I POSORTUJE JE PRZECIWNIE DO ALFABETU

        System.out.println("----------------------");
        List<String> names = List.of("Antonio", "Sara", "Mike", "Eric", "Sonia", "Simon", "Charlie");
                names.stream()
                        .filter(u -> u.startsWith("S"))
                        .sorted(Comparator.comparing(String::toString).reversed())
                        .forEach(System.out :: println);

// ZADANIE 6: POLICZ ŚREDNIĄ WIEKU

        System.out.println("----------------------");
        double avg = Main.getPeople().stream()
                .mapToInt(Person::getAge)
                .average()
                .getAsDouble();
        System.out.println(avg);

// ZADANIE 7: DLA OSÓB W KLASIE PERSON ZAMIEŃ LITERY NA MAlE A NASTĘPNIE POKAŻ WSZYSTKIE ZACZYNAJĄCE SIĘ NA A POSORTOWANE MALEJĄCO WG WIEKU

        List<String> sortedNames = Main.getPeople()
                .stream()
                .filter(u -> u.getName().startsWith("A"))
                .sorted(Comparator.comparing(Person::getAge).reversed())
                .map(u -> u.getName().toLowerCase())
                .collect(Collectors.toList());
        System.out.println(sortedNames);







    }
}
