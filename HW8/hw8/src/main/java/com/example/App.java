package com.example;

public class App {
    static String[] names = {"Anne", "John", "Alex", "Jessica"};

    static String[] reverse(String[] a) {
        String[] r = new String[a.length];
        for (int i = 0; i < a.length; i++) {
            String s = "";
            for (int j = a[i].length() - 1; j >= 0; j--) {
                s += a[i].charAt(j);
            }
            r[a.length - 1 - i] = s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
        }
        return r;
    }

    static void print(String[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("\"" + a[i] + "\"");
        }
        System.out.println("End of the array");
    }

    public static void main(String[] args) {
        System.out.println("Original array:");
        print(names);
        System.out.println("=========");
        System.out.println("Resultant array:");
        print(reverse(names));
    }
}