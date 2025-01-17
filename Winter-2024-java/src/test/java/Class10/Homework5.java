package Class10;

import java.util.Arrays;

public class Homework5 {
    public static void main(String[] args) {
        /**
         * Q1: Print values present at even index-numbers from given array in below format
         * Example:
         *      array1 = {"jOy", "earn", "lEarn", "smIle", "GiVE", "BeautifUl", "KIM"};
         *
         *      Value present at index-0 is Joy
         *      Value present at index-2 is Learn
         *      Value present at index-4 is Give
         *      ...
         *      ...
         *
         */
        // Input array
        String[] array1 = {"jOy", "earn", "lEarn", "smIle", "GiVE", "BeautifUl", "KIM"};

        // Iterate through the array
        for (int i = 0; i < array1.length; i++) {
            // Check if the index is even
            if (i % 2 == 0) {
                // Format the value to have the first letter capitalized and the rest in lowercase
                String formattedValue = array1[i].substring(0, 1).toUpperCase() + array1[i].substring(1).toLowerCase();
                // Print the result
                System.out.println("Value present at index-" + i + " is " + formattedValue);
            }
        }
        /**
         * Q2: Print the given string in reverse order
         * "have a GreAT day" -> "day GreAT a have"
         * "Good Morning" -> "Morning Good"
         * "Joy" -> "Joy"
         *
         */
        //String givenString = "";
        //String resultString = ""; // to store the result
        // code
        // there should NOT be any sout-statement in the for-loop
        //System.out.println("Given -> " + givenString);
        //System.out.println("Result -> " + resultString);
        // Input string
        String givenString = "have a GreAT day";
        //String givenString = "Good Morning";
        //String givenString = "Joy";
        // Split the string into words
        String[] words = givenString.split(" ");
        // Initialize an empty result string
        String resultString = "";
        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            resultString += words[i];
            // Add a space after each word except the last one
            if (i != 0) {
                resultString += " ";
            }
        }
        // Print the result outside the loop
        System.out.println("Given -> " + givenString);
        System.out.println("Result -> " + resultString);

        /**
         * Q3: Find the total of given int-array
         * int[] numbers = {1,2,3,4,5}      ->  15
         * int[] numbers = {1,2,3,1,5,6,8}  ->  26
         * int[] numbers = {1, 2, -1, -3}   ->  -1
         */
        //int[] numbers = {1, 2, -1, -3};
        //int total = 0;
        // code
        // there should NOT be any sout-statement in the for-loop
        // Input array
        //int[] numbers = {1,2,3,4,5};
        int[] numbers = {1,2,3,1,5,6,8};
        //int[] numbers = {1, 2, -1, -3};
        // Variable to store the total
        int total = 0;

        // Loop to calculate the total
        //  for (int i = 0; i < numbers.length; i++) {
        //    int number = numbers[i]; // Accessing the current element
        // Use 'number' here
        //  {total += number;} } // Add each number to the total

        // Loop to calculate the total different one
        for (int number : numbers) {
            total += number; // Add each number to the total
        }
            // Print the result outside the loop
            System.out.println("Given array -> " + Arrays.toString(numbers));
            System.out.println("Total -> " + total);
        }
    }

