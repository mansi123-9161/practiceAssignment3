package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelTest {e
    RemoveVowel removeVowel;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.removeVowel = new RemoveVowel();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.removeVowel=null;
    }
   // @Test
    public void theGivenStringArrayShouldGiveCorrect() {
        int row=2;
        int column=2;
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{1,2},{3,4}};
        int[][] actualresult=matrixAddition.addMatrix(row,column,matrix1,matrix2);
        int[][] result={{2,4},{6,8}};
        assertArrayEquals(result,actualresult);
    }
    @Test
    public void givenArrayShouldRemoveVowel() {
        String[] expected = {"Ind", "Untd Stts", "Grmny", "Egypt", "czchslvk"};
        String[] string = {"India", "United States", "Germany", "Egypt", "czechoslovakia"};
        String[] actual = removeVowel.removeVowel(string);

        assertArrayEquals(expected, actual);
    }
    @Test
    public void givenArrayShouldNotRemoveVowel() {
        String[] expected = {"India"};
        String[] string = {"India"};
        String[] actual = removeVowel.removeVowel(string);

       assertNotEquals(expected,actual);
    }
}