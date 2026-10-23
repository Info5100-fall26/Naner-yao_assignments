package com.example;
import java.util.Scanner;
public class App 
{
    public static void main( String[] args )
    {
       Scanner input = new Scanner(System.in);
       try{
        System.out.println("Enter a number:");
        int n = input.nextInt();
       } catch (Exception e) {
           System.out.println("Invalid input. Please enter a valid number.");
       } finally {
           System.out.println("The 'try catch' is finished.");
       }
       }
    }

