package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplimentation(){
        Instructor instructor = new Instructor(2,"Joye");
        Assert.assertTrue(instructor instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor instructor = new Instructor(2,"Joye");
        Assert.assertTrue(true);
    }

    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(2,"Joye");
        Student student = new Student(1,"miral");

        Double expected = 12.00;
        instructor.teach(student,expected);

        Assert.assertEquals(expected,student.getTotalStudyTime());

    }

    @Test
    public void testLecture(){
        Instructor instructor = new Instructor(2,"Joye");
        Student[] students = new Student[5];

        for(int i = 0; i < students.length; i++){
            students[i] = new Student((long)i, "joye" +1);
        }

        instructor.lecture(students,15);
        Double expected = 3.00;

        Assert.assertEquals(expected,students[4].getTotalStudyTime());

    }

}
