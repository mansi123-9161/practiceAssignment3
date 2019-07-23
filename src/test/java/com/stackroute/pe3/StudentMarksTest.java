package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class StudentMarksTest {

    StudentMarks studentMarks;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.studentMarks = new StudentMarks();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.studentMarks=null;
    }


    @Test
    public void theGivenNumberShouldBeGreaterThanZero() {
        String expected="All marks are correct";
        int[] studentMarks={12,23,56,78};
        String actualresult=studentMarks.checkStudentsMarks(studentMarks,4);
        assertEquals(expected,actualresult);
    }
    @Test
    public void theGivenNumberShouldBeFailToGreaterThanZero() {
       // int numberOfStudents = 3;
        int [] studentsMarks={12,0,56};
        String actualresult = studentMarks.checkStudentsMarks( studentsMarks,0);
        assertEquals("please enter value greater than zero", actualresult);
    }
    @Test
    public void theGivenGradeIsBelowTheLimit() {
       int[] studentMarks={12,0,67};
        String actualresult = studentMarks.checkStudentsMarks( studentMarks,3);
        //assertEquals(grade, actualresult);
        assertEquals("enter the value within the range", actualresult);
    }
    @Test
    public void theGivenGradeIsAboveTheLimit() {
      //  int grade = 101;
        int [] studentMarks={23,109,78};
        String actualresult = studentMarks.checkStudentsMarks(studentMarks,3);
      //  assertEquals(grade, actualresult);
        assertEquals("enter the value within the range", actualresult);
    }
    @Test
    public void theGivenGradeIsNull() {
        int[] studentMarks={};
        String actualresult = studentMarks.checkStudentsMarks(studentMarks,3);
        assertNull(actualresult);
        assertNull("enter valid value");
    }

}