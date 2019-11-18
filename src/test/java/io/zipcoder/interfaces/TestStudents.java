package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudents {
    @Test
    public void testStudents(){
        Students students = Students.getInstance();

        for(int i = 0; i < 35; i++){
            students.add(new Student(i, "miral"+i));
        }

        Integer expected = 37;

        Assert.assertEquals(expected, students.count());


    }
}