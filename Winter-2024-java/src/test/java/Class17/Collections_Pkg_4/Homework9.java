package Class17.Collections_Pkg_4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;

public class Homework9 {
    public static void main(String[] args) {

        /**
         * Find the count of color-names in Array
         */
        //String[] colors = {"green", "red", "green" , "blue", "green", "green", "blue", "orange", "red", "blue", "green"};
        /*
          //  example: {(green-3) , (red-4), (blue-4)}
         */

        String[] colors = {"green", "red", "green", "blue", "green", "green", "blue", "orange", "red", "blue", "green"};
        HashMap<String, Integer> colorCountMap = new HashMap<>();

        for (String color : colors) {
            if (colorCountMap.containsKey(color)) {
                colorCountMap.put(color, colorCountMap.get(color) + 1);
            } else {
                colorCountMap.put(color, 1);
            }
        }

        System.out.println("Color count: " + colorCountMap);



        /**
         * Find the duplicate names from given Array
         */
        //String[] names = {"john", "liya", "kendra" , "john", "doe", "jay", "riya", "rimmi", "liya"};
        /*
         //   example: [john, liya]
         */


        String[] names = {"john", "liya", "kendra", "john", "doe", "jay", "riya", "rimmi", "liya"};
        Set<String> nameSet = new HashSet<>();
        Set<String> duplicates = new HashSet<>();

        for (String name : names) {
            if (!nameSet.add(name)) { // add() returns false if the name is already present
                duplicates.add(name);
            }
        }

        System.out.println("Duplicate names: " + duplicates);

    }
}
