package com.example;

import java.util.ArrayList;

public class labpt2 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Alice");
        names.add("Jack");
        names.add("Emma");
        names.add("Oliver");
        names.add("Sophia");

        ArrayList<String> swappedNames = new ArrayList<>();

        for (String name : names) {
            String lower = name.toLowerCase();
            int last = lower.length() - 1;
            String swapped = lower.charAt(last) + lower.substring(1, last) + lower.charAt(0);
            swapped = swapped.substring(0, 1).toUpperCase() + swapped.substring(1);

            swappedNames.add(swapped);
        }

        System.out.println("Names = { " + String.join(", ", names) + " }");
        System.out.println("Names (switched) = { " + String.join(", ", swappedNames) + " }");
    }
}