package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;

    // tworzę polę, które będzie przechowywało liczbę uczniów w poszczególnych klasach
    private List<Integer> numbersOfStudents = new ArrayList<>();

    //tworzę konstruktor szkoły, do którego trzeba będzie podać inię szkoły i dowolną ilość liczb uczniów w poszczególnych klasach
    public School(String schoolName, int... numbersOfStudents) {
        this.schoolName = schoolName;
        for (int student : numbersOfStudents)
            this.numbersOfStudents.add(student);
    }

    //motoda sumująca wszystkich uczniów w szkolę --> sumuje wszystkie wyrażenia w List<Integer>
    public int sumOfStudents() {
        int sumOfStudents = 0;
        for (int i = 0; i < numbersOfStudents.size(); i++) {
            sumOfStudents = sumOfStudents + numbersOfStudents.get(i);
        }
        return sumOfStudents;
    }

    //metoda zwracająca imię szkoły
    public String getSchoolName() {
        return this.schoolName;
    }
}
