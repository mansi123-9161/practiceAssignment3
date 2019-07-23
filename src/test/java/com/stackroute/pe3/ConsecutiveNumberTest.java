package com.stackroute.pe3;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveNumberTest {
    ConsecutiveNumber consecutiveNumber;

    @Before
    public void setUp() throws Exception {
        consecutiveNumber = new ConsecutiveNumber();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void givenConsecutiveNumberShouldNotBeValid() {
        boolean expected = false;

        boolean actualresult = consecutiveNumber.checkConsecutive("98,96,95,94,93");

        assertEquals(expected, actualresult);
    }

    @Test
    public void givenConsecutiveNumberShouldReturnTrue() {
        boolean expected = true;
        boolean actualresult = consecutiveNumber.checkConsecutive("54,53,52,51,50,49,48");

        assertEquals(expected, actualresult);
    }

    @Test
    public void givenConsecutiveNumberShouldBeMoreThanOne() {
        boolean expected = false;
        boolean actualresult = consecutiveNumber.checkConsecutive("1");

       assertEquals("please enter more than one value",expected,actualresult);
    }

}