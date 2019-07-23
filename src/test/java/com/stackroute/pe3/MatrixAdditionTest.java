package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixAdditionTest {
    MatrixAddition matrixAddition;
    @Before
    public void setUp() throws Exception {
        //arrange
        System.out.println("inside before");
        this.matrixAddition = new MatrixAddition();
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("inside after");
        this.matrixAddition=null;
    }

    @Test
    public void theGivenMatrixIsHavingProperSum() {
        int row=2;
        int column=2;
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{1,2},{3,4}};
        int[][] actualresult=matrixAddition.addMatrix(row,column,matrix1,matrix2);
        int[][] result={{2,4},{6,8}};
        assertArrayEquals(result,actualresult);
    }
    @Test
    public void theGivenMatrixShouldHaving() {
        int row=2;
        int column=1;
        int[][] matrix1={{1,2},{3,4}};
        int[][] matrix2={{1,2},{3,4}};
        int[][] actualresult=matrixAddition.addMatrix(row,column,matrix1,matrix2);
       // int[][] result={{2,4},{6,8}};
        assertEquals("out of bound",actualresult);
    }
}