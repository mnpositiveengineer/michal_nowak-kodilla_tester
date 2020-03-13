package com.youtube.assembly;

import java.time.LocalDate;

public class Element {
    private final String name;
    private int numbers;
    private final Type type;
    private LocalDate assemblyDate;

    public Element(String name, int numbers, Type type, LocalDate assemblyDate) {
        this.name = name;
        this.numbers = numbers;
        this.type = type;
        this.assemblyDate = assemblyDate;
    }

    public String getName() {
        return name;
    }

    public int getNumbers() {
        return numbers;
    }

    public Type getType() {
        return type;
    }

    public LocalDate getAssemblyDate() {
        return assemblyDate;
    }

    @Override
    public String toString() {
        return "Element{" +
                "name='" + name + '\'' +
                ", numbers=" + numbers +
                ", type=" + type +
                ", assemblyDate=" + assemblyDate +
                '}';
    }
}
