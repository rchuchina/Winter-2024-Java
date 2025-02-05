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

        System.out.println("Reversed: " + reverseWords("have a GreAT day"));  // Output: "day GreAT a have"
        System.out.println("Reversed: " + reverseWords("Good Morning"));     // Output: "Morning Good"
        System.out.println("Reversed: " + reverseWords("Joy"));              // Output: "Joy"
        /**
         * Q2: Create a method to find the total of given int-array
         * int[] numbers = {1,2,3,4,5}      ->  15
         * int[] numbers = {1,2,3,1,5,6,8}  ->  26
         * int[] numbers = {1, 2, -1, -3}   ->  -1
         */

        int[] numbers1 = {1, 2, 3, 4, 5};
        int[] numbers2 = {1, 2, 3, 1, 5, 6, 8};
        int[] numbers3 = {1, 2, -1, -3};

        System.out.println("Total: " + getTotal(numbers1));  // Output: 15
        System.out.println("Total: " + getTotal(numbers2));  // Output: 26
        System.out.println("Total: " + getTotal(numbers3));  // Output: -1

        /**
         * Q3: Create a method to make abbreviation of given String
         *  live A life                 ->      LAL
         *  Make AmErica great Again    ->      MAGA
         *  gOOd Morning                ->      GM
         */


        System.out.println("Abbreviation: " + makeAbbreviation("live A life"));         // Output: LAL
        System.out.println("Abbreviation: " + makeAbbreviation("Make AmErica great Again")); // Output: MAGA
        System.out.println("Abbreviation: " + makeAbbreviation("gOOd Morning"));        // Output: GM
    }

    // Q1: Reverse words in a string
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";
            }
        }
        return result;
    }


    // Q2: Find total of an int-array
    public static int getTotal(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }

    // Q3: Create an abbreviation from a string
    public static String makeAbbreviation(String str) {
        String[] words = str.split(" ");
        String result = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                result += Character.toUpperCase(word.charAt(0));
            }
        }
        return result;
    }
}

