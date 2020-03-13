package com.youtube.assembly;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ElementManager {

    public List<Element> createTheListsOfElements(){
        List<Element> elements = new ArrayList<>();
        elements.add(new Element("Column", 20, Type.OFFER, LocalDate.of(2020, 03, 12)));
        elements.add(new Element("Beam", 45, Type.PROJECT, LocalDate.of(2020, 03, 15)));
        elements.add(new Element("Girder", 10, Type.OFFER, LocalDate.of(2020, 03, 14)));
        elements.add(new Element("Hollow Core Slab", 180, Type.PROJECT, LocalDate.of(2020, 03, 17)));
        elements.add(new Element("Filigree", 180, Type.OFFER, LocalDate.of(2020, 03, 25)));
        elements.add(new Element("Balcony", 4, Type.PROJECT, LocalDate.of(2020, 03, 18)));
        return elements;
    }
}
