package com.kodilla.school;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTestSuite {
    @Test
    public void shouldCalculateCorrectAveragesIfValuesAreInRange(){
        Student student = new Student("Martin");
        student.addGeographyGrade(4);
        student.addGeographyGrade(4);
        student.addGeographyGrade(2);

        double geographyAverage = student.getGeographyAverage();

        assertEquals(3.33, geographyAverage, 0.01);
    }
}
