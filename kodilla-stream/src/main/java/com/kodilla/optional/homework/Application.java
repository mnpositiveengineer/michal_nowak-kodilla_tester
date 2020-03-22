package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Kasia", new Teacher("Sophie")));
        students.add(new Student("Michał", null));
        students.add(new Student("Asia", new Teacher("Rachel")));
        students.add(new Student("Krzysztof", null));

        for(Student student : students){
            System.out.println("Student: " + student.getTeacher().getName() + "; Teacher: " + student.getTeacher().getName());

            System.out.println();
        }
    }
}
