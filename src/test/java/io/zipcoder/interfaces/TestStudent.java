package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplimentation(){
        Student student = new Student(1,"miral");

        Assert.assertTrue(student instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student student = new Student(1,"miral");

        Assert.assertTrue(student instanceof Person);
    }

    @Test
    public void testLearn (){
        Student student = new Student(1,"miral");

        Double expectedTime = 10.00;
        student.learn(expectedTime);

        Assert.assertEquals(expectedTime, student.getTotalStudyTime());
    }
}
