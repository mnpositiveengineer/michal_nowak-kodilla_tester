package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark", new Teacher("Alfred")));
        students.add(new Student("John", new Teacher("Sonia")));
        students.add(new Student("Cindy", null));
        students.add(new Student("Kate", null));

        for (Student student : students){
            Optional<Teacher> optionalTeacher = Optional.ofNullable(student.getTeacher());
            optionalTeacher.orElse( new Teacher("undefined"));
            System.out.println("Student: " + student.getName() + ", Teacher: " + student.getTeacher().getName());
        }
    }
}
