package com.example;

public class MathDemo 
{
    public static void main( String[] args )
    {
        int x = 10, y = 25;
        System.out.println("max(x, y) = " + Math.max(x, y));
        System.out.println("min(x, y) = " + Math.min(x, y));
        System.out.println("sqrt(y) = " + Math.sqrt(y));
        System.out.println("pow(x, 2) = " + Math.pow(x, 2));
        System.out.println("log(x) = " + Math.log(x));
        System.out.println("log10(x) = " + Math.log10(x));
        System.out.println("log1p(x) = " + Math.log1p(x));
        System.out.println("exp(x) = " + Math.exp(x));
        System.out.println("expm1(x) = " + Math.expm1(x));
    }
}
