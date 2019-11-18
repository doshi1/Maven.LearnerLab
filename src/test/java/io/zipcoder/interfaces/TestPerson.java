package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {
    @Test
    public void testConstructor(){
        Person person = new Person(1,"miral");

        long givenId = 1;
        String givenName = "miral";

        Assert.assertEquals(givenId, person.getId());
        Assert.assertEquals(givenName,person.getName());
    }

    @Test
    public void testSetName() {
        Person person = new Person(1, "miral");

        String givenName = "miral";
        person.setName(givenName);

        Assert.assertEquals(givenName, person.getName());

    }
}
