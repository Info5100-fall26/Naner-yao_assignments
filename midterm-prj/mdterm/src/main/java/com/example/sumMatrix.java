package com.example;


public class sumMatrix
{
    public static void main( String[] args )
    {
        int[][] matrix = {
            {8,2,3},
            {1,3,6}
        };
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of matrix elements: " + sum);
    }
}
