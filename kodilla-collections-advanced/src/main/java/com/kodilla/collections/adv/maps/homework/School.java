package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String schoolName;
    List<Integer> numbersOfStudents = new ArrayList<>();

    public School(String schoolName, int... numbersOfStudents){
        this.schoolName = schoolName;
        for (int student : numbersOfStudents)
        this.numbersOfStudents.add(student);
    }
    public int sumOfStudents(){
        int sumOfStudents =0;
        for (int i = 0; i < numbersOfStudents.size(); i++){
            sumOfStudents = sumOfStudents + numbersOfStudents.get(i);
        }
        return sumOfStudents;
    }
    public String getSchoolName(){
        return this.schoolName;
    }
}
