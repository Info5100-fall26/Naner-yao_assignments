package com.example;

public class App 
{
    public static void main( String[] args )
    {
        int[][] A = {{2, 3, 4}, {3, 4, 5}};
        int[][] B = {{1, 2}, {3, 4}, {5, 6}};
        if (A[0].length != B.length) {
            System.out.println("Cannot multiply");
            return;
        }
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        System.out.println("A * B = ");
        for (int i = 0; i < C.length; i++) {
            for (int j = 0; j < C[0].length; j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }
    }
}
