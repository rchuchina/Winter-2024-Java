package Class6;

import java.util.concurrent.atomic.AtomicInteger;

public class Homework2 {
    public static void main(String[] args) {
        String countryName1 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        int result1;
        /**
         * Assign value in the result1-variable
         * if the countryName-length is greater or equals to 6
         *      assign 10 in result1
         * otherwise
         *      assign 20 in result1
         *
         * Hint: Ternary operator        */
        System.out.println("countryName1 -> " + countryName1);
        System.out.println("\nmethod - length()");
        int countryName1Length = countryName1.length();
        System.out.println("countryName1 length -> " + countryName1Length);
        System.out.println("\nif countryName1Length is greater than or equal to 6");
        result1 = countryName1Length >= 6 ? 10 : 20;
        System.out.println("result1 : " + result1);
        /**
         * Ignore-cases for all below tasks
         *
         * 1. find if countryName2 contains R
         * 2. find if countryName2 starts with Ki
         * 3. find if countryName2 and countryName1 are having same value
         * 4. replace "D" in countryName2 with "SiGMa"
         */

        /**
         * Ignore-cases for all below tasks
         * 1. find if countryName2 contains  R
         */
        String countryName2 = "UNiTeD KInGDom OF GReAt BRiTaIn And NorTHerN irElaND";
        String countryName2Lowercase = countryName2.toLowerCase();
        System.out.println("\nmethod - toLowerCase()");
        System.out.println("countryName2 -> " + countryName2);
        System.out.println("countryName2Lowercase -> " + countryName2Lowercase);

        String pattern = "R";
        System.out.println("\nmethod - toLowerCase()");
        System.out.println("pattern -> " + pattern);
        System.out.println("patternLowerCase -> " + pattern.toLowerCase());
        boolean isContains_R = countryName2.contains(pattern.toLowerCase());
        System.out.println("does countryName2 contain 'R' -> " + isContains_R);

        /**
         * Ignore-cases for all below tasks
         * 2. find if countryName2 starts with Ki
         */
        String countryName2UpperCase = countryName2.toUpperCase();
        System.out.println("\nmethod - toUpperCase()");
        System.out.println("countryName2UpperCase -> " + countryName2UpperCase);

        String pattern1 = "Ki";
        String pattern1UpperCase = pattern1.toUpperCase();
        System.out.println("\nmethod - toUpperCase()");
        System.out.println("pattern1 -> " + pattern1);
        System.out.println("pattern1UpperCase -> " + pattern1UpperCase);
        boolean isCountryName2StartsWith_Ki = countryName2UpperCase.startsWith(pattern1UpperCase);
        System.out.println("is countryName2 starts with \"" + pattern1 + "\" (ignoring cases) -> " + isCountryName2StartsWith_Ki);

        /**
         * Ignore-cases for all below tasks
         * 3. find if countryName2 and countryName1 are having same value
         */


        System.out.println("\nmethod - equalsIgnoreCase()");
        System.out.println("countryName1 -> " + countryName1);
        System.out.println("countryName2 -> " + countryName2);
        boolean isCountryName1EqualsIgnoreCase_countryName2 = countryName2.equalsIgnoreCase(countryName1);
        System.out.println("is countryName1 equalsIgnoreCase countryName2 -> " + isCountryName1EqualsIgnoreCase_countryName2);


        /**
         * Ignore-cases for all below tasks
         * 4. replace "D" in countryName2 with "SiGMa"
         */

        System.out.println("\nmethod - replace()");
        System.out.println("countryName2  Upper Case-> " + countryName2UpperCase);
        String replace_D_SiGMa = countryName2UpperCase.replace("D", "SiGMa");
        System.out.println("countryName2 Upper Case after replace 'D' with 'SiGMa' -> " + replace_D_SiGMa);

    }
}