package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        //mapa przyporządkowująca dyrektorów do szkół
        Map<Principal, School> map = new HashMap<>();

        //dodaję kilku dyrektorów wraz ze szkołami do mapy.
        map.put(new Principal("Mark Shark"), new School("Great Oak Charter School", 24, 25, 19, 12, 31));
        map.put(new Principal("Michael Newman"), new School("Panorama Middle School", 11, 17, 20, 10, 12));
        map.put(new Principal("Robert Dawson"), new School("Oyster Harbour College", 7, 6, 14, 10, 11));
        map.put(new Principal("Diana Ysk"), new School("Eastview School for Girls", 32, 24, 21));

       // pętlą for each wyświetlam dane każdej szkoły wraz z dyrektorem
        for (Map.Entry<Principal, School> info : map.entrySet()){
            System.out.println("School name: " + info.getValue().getSchoolName() + ", Principal: " + info.getKey().getPrincipal() + ", Number of students: " + info.getValue().sumOfStudents() );
        }
    }
}
