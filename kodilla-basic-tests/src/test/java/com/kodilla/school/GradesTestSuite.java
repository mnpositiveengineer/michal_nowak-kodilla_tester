package com.kodilla.school;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GradesTestSuite{
    @Test
    public void ShouldHaveZeroLength(){
        Grades grades = new Grades();
        int[] values = grades.getValues();
        assertEquals(0, values.length);
    }
    @Test
    public void ShouldAddTwoElementstoArray(){
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        int[] values = grades.getValues();
        assertEquals(2, values.length);
        assertEquals(4, values[0]);
        assertEquals(2, values[1]);
    }
    @Test
    public void ShouldCalculateAverage(){
        Grades grades = new Grades();
        grades.add(4);
        grades.add(2);
        grades.add(5);
        assertEquals(3.66, grades.getAverage(), 0.01);
    }
        }