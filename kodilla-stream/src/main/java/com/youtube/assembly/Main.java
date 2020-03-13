package com.youtube.assembly;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // ZADANIE 1 - POSORTUJ PO DATACH MONTAŻU
        ElementManager elementManager = new ElementManager();
        List<Element> sortedByDate = elementManager.createTheListsOfElements()
                .stream()
                .sorted(Comparator.comparing(Element::getAssemblyDate))
                .collect(Collectors.toList());
        sortedByDate.forEach(System.out :: println);

        System.out.println("----------------------------------");

        // ZADANIE 2 - POGRUPUJ ELEMENTY OFERTOWE I PROJEKTOWE - ZMAPUJ
        Map<Type, List<Element>> groupedByBom = elementManager.createTheListsOfElements()
                .stream()
                .collect(Collectors.groupingBy(Element::getType));
        groupedByBom.forEach((type, elements) -> {
            System.out.println(type);
            System.out.println(elements);
        });

    }
}
