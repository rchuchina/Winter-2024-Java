package Class11;

//import java.util.Arrays;

public class Homework6 {
   public static void main(String[] args) {

        // there should NOT be any sout-statement in the for-loop or in method

        /**
         * Q1: Create a method return string in reverse order
         * "have a GreAT day" -> "day GreAT a have"
         * "Good Morning" -> "Morning Good"
         * "Joy" -> "Joy"
         *
         */
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
             * Q2: Create a method to find the total of given int-array
             * int[] numbers = {1,2,3,4,5}      ->  15
             * int[] numbers = {1,2,3,1,5,6,8}  ->  26
             * int[] numbers = {1, 2, -1, -3}   ->  -1
             */

        /**
         * Q3: Create a method to make abbreviation of given String
         *  live A life                 ->      LAL
         *  Make AmErica great Again    ->      MAGA
         *  gOOd Morning                ->      GM
         */



   }
}
