package Class8;

import java.util.Arrays;

public class Homework3 {
    public static void main(String[] args) {

        /**
         * Question-1:
         * Create an empty array which can store 5-string values
         * using index-values, store 5-names in it.
         *
         * a) Print the entire array
         * b) if index-2-name has more than 5 characters, print the total number of characters present in the name
         *      otherwise, print the name in uppercase
         *
         */
         // Create an empty array which can store 5-string values
        String[] Names5 = new String[5];
        //store 5-string values using index-values, store 5-names in it.
        System.out.println("Names5 -> " + Arrays.toString(Names5));

        //a) Print the entire array
        System.out.println("\nFill or Replace values in array using index-numbers");
        Names5[0] = "Marry";
        Names5[1] = "Nick";
        Names5[2] = "Anna";
        Names5[3] = "Henry";
        Names5[4] = "Robert";
        System.out.println("Names5 -> " + Arrays.toString(Names5));

        //b) if index-2-name has more than 5 characters, print the total number of characters present in the name otherwise, print the name in uppercase
        System.out.println("\nif-else block");
        System.out.println("Names5[2] = " + Names5[2]);
        int result;
        System.out.println("\nmethod - length()");
        result = Names5[2].length();
        if (result >=  5) {
            System.out.println("Names5[2].length = " + result);
        }
        else {
            System.out.println("Names5[2]  = " + Names5[2]);
        }

        System.out.println("\nif-else block");
        System.out.println("Names5[4] = " + Names5[4]);
        int result1;
        System.out.println("\nmethod - length()");
        result1 = Names5[4].length();
              if (result1 >=  5) {
                   System.out.println("Names5[4].length = " + result1);
        }
              else {
            System.out.println("Names5[4]  = " + Names5[4]);
        }


        /**
         * Question-2:
         * Create a String-variable and store any 4-words sentence in it
         *  4-words sentence example:
         *          Have a happy life
         *          have a great day
         *          wOrk HaRD paRTy HArdEr
         *          stay humble keep smiling
         *
         * convert the String into Titlecase (convert 1st-letter of each word into Uppercase and all other letters into lowercase)
         * wOrk HaRD paRTy HArdEr   -> Work Hard Party Harder
         * stay humble keep smiling -> Stay Humble Keep Smiling
         *
         */

        String[] sen4word = new String[4];
        //store 5-string values using index-values, store 5-any 4-words sentence in it.
        System.out.println("sen4word -> " + Arrays.toString(sen4word));
        //a) Print the entire array
        System.out.println("\nFill or Replace values in array using index-numbers");
        sen4word[0] = "Have a happy life";
        sen4word[1] = "have a great day";
        sen4word[2] = "wOrk HaRD paRTy HArdEr";
        sen4word[3] = "stay humble keep smiling";
        System.out.println("sen4word -> " + Arrays.toString(sen4word));

        System.out.println("\nmethod - split()");
        String[] splitBy_space = sen4word[0].split(" ");
        int splitBy_space_length = splitBy_space.length;
        System.out.println("split by ' ' -> " + Arrays.toString(splitBy_space));
        System.out.println("Length of splitBy_space -> " + splitBy_space_length);


    }
}
