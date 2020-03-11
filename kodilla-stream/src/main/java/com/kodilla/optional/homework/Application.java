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
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            String optionalName = optionalTeacher.orElse(new Teacher("undefined")).getName();
            System.out.println("Student: " + student.getName() + "; Teacher: " + optionalName);
        }
    }
}
