package com.example;
import java.time.LocalTime;
import java.util.Scanner;

public class WordTime {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);

        System.out.print("Enter any word: ");
        LocalTime start = LocalTime.now();
        String word = input.nextLine();
        LocalTime end = LocalTime.now();

        long t = (end.toNanoOfDay() - start.toNanoOfDay()) / 10000000;
        double z = t / 100.0;
        int y = word.length();

        if (word.isEmpty()) {
            System.out.println("You did not enter any word");
        } else if (word.trim().isEmpty()) {
            System.out.println("You entered an empty line. Please reenter");
        } else {
            String type;
            if (y <= 5) {
                type = "short";
            } else if (y <= 10) {
                type = "medium";
            } else {
                type = "long";
            }
            System.out.println("Your word is " + word);
            System.out.println("It is a " + type + " word");
            System.out.println("The length of the word is " + y);
            System.out.println("Your reaction time is " + z + " seconds");
        }
    }
}
