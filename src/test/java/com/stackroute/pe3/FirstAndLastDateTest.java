package com.stackroute.pe3;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDateTest {

  FirstAndLastDate firstAndLastDate;


    @Before
    public void setUp() {
        System.out.println("Inside setup");
        firstAndLastDate = new FirstAndLastDate();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        firstAndLastDate = null;
    }

    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = firstAndLastDate.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = firstAndLastDate.endDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

}