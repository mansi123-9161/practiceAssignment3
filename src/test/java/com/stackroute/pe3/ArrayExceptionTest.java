package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
public class ArrayExceptionTest {
    ArrayException arrayException;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.arrayException = new ArrayException();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.arrayException=null;
    }

    @Test(expected = NegativeArraySizeException.class)
    public void givenArrayExceptionShouldThrowNegativeArraySizeExcpetion() {
        //act

        String[] actualResult = arrayException.givenException("value");
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void givenArraySizeIsOutOfBound() {
        System.out.println("Inside testPrintMessage()");
        arrayException.givenException(String[] array);
    }

    @Test(expected = NegativeArraySizeException.class)
    public void givenArrayExceptionShouldThrowNullPointerExcpetion() {
        //act
        //  String result=null;
        String actualResult = arrayException.givenException(array);

    }
}