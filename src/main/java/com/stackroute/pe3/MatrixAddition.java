package com.stackroute.pe3;

public class MatrixAddition {
    public int[][] checkSum(int rows, int colums, int matrix1[][], int matrix2[][]) {
        int sum[][] = new int[rows][colums];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < colums; j++) {
                    sum[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            return sum;
        }
}