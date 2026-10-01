package edu.neu.mgen;

import java.util.ArrayList;

public class App 
{
    public static void main( String[] args )
    {
        //1.
        String str = "Oakland";
        int length = str.length();
        System.out.println("The length of the string is: " + length);
        int index2 = str.charAt(2);
        System.out.println("The index of the character at position 2 is: " + index2);
        String substring = str.substring(3);
        System.out.println("The substring starting from index 3 is: " + substring);
        String upperCase = str.toUpperCase();
        System.out.println("The string in uppercase is: " + upperCase);

        //2.
        int[] abc = {1, 2, 3, 2, 5};
        int length2 = abc.length;
        System.out.println("The length of the array is: " + length2);
        int lastnum = abc[abc.length - 1];
        System.out.println("The last number in the array is: " + lastnum);
        //3.
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Austin");
        cities.add("Houston");
        cities.add("Oakland");
        cities.add("Paris");
        cities.add("San Francisco");
        cities.add("Seattle");
        System.out.println("Original list: " + cities);

        cities.remove("Paris");
        System.out.println("After removing Paris: " + cities);
    }
}
