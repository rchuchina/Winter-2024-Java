package Class15.Collections_Pkg_2;

import java.util.ArrayList;

public class Homework7 {
    public static void main(String[] args) {
        ArrayList<String> student2027List = new ArrayList<>();      // []
        student2027List.add("John");
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("LuX");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        student2027List.add("Jia John");
        student2027List.add("Jia Lis");
        student2027List.add("King");
        student2027List.add("QUEEN");
        student2027List.add("Dime");
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("John");
        student2027List.add("KenDRa");
        student2027List.add("JOHN");
        student2027List.add("JIa");
        student2027List.add("MichAEl");
        student2027List.add("LuX");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        student2027List.add("Jia John");
        student2027List.add("John");
        student2027List.add("Kendra");
        student2027List.add("Jia");
        student2027List.add("John");
        student2027List.add("JIa");
        //student2027List.add("Jia John");
        student2027List.add("Jia Rimma");
        student2027List.add("Jia Lis");
        student2027List.add("King");
        student2027List.add("QUEEN");
        student2027List.add("Dime");

        System.out.println("student2027ListSize -> "+ student2027List.size());      // 46
        System.out.println("student2027List -> "+ student2027List);

        /**
         * Q1: Find the index-of third occurrence of JOHN(ignoring cases) in student2027List
         *
         * if third-occurrence of JOHN (ignoring cases) is present in student2027List
         *      store the index-number in a variable, and then print it.
         * else
         *      store -1 in a variable, and then print it.
         */
        int count = 0;
        int indexThirdJohn = -1;
        for (int i = 0; i < student2027List.size(); i++) {
            if (student2027List.get(i).equalsIgnoreCase("JOHN")) {
         //   if (student2027List.get(i).equalsIgnoreCase("Rimma")) {
                count++;
                if (count == 3) {
                    indexThirdJohn = i;
                    break;
                }
            }
        }
        System.out.println("Index of third occurrence of 'JOHN' (ignoring cases): " + indexThirdJohn);
        //System.out.println("Index of third occurrence of 'Rimma' (ignoring cases): " + indexThirdJohn);

        /**
         * Q2: Find the number of students who has name starts with "g"(ignore cases) in student2027List
         */
        int countG = 0;
        for (String name : student2027List) {
            if (name.toLowerCase().startsWith("g")) {
           // if (name.toLowerCase().startsWith("l")) {
                countG++;
            }
        }
        System.out.println("Number of students whose name starts with 'G' (ignoring cases): " + countG);
        //System.out.println("Number of students whose name starts with 'l' (ignoring cases): " + countG);



        /**
         * Q3: Find if "King" (ignore cases) is present ONLY once in student2027List
         *
         * if "King" (ignore cases) is present ONLY once in student2027List
         *      store true in variable, and then print it
         * else
         *      store false in variable, and then print it
         */
        int countKing = 0;
        for (String name : student2027List) {
            if (name.equalsIgnoreCase("King")) {
            //if (name.equalsIgnoreCase("Jia Rimma")) {
                countKing++;
            }
        }
        boolean isKingOnlyOnce = countKing == 1;
        System.out.println("Is 'King' present ONLY once? " + isKingOnlyOnce);
        //System.out.println("Is 'Jia Rimma' present ONLY once? " + isKingOnlyOnce);

        /**
         * Q4: Find the total of bills-ArrayList
         */
        ArrayList<Double> bills = new ArrayList<>();
        bills.add(101.01);
        bills.add(89.76);
        bills.add(564.93);
        bills.add(98.65);
        bills.add(7.98);
        bills.add(23.17);
        bills.add(983.89);
        bills.add(64.83);
        bills.add(57.7);
        bills.add(101.01);
        bills.add(112.9);
        bills.add(2.32);
        bills.add(12.34);
        bills.add(98.45);
        bills.add(98.65);
        //bills.add(-100.0);

        double totalBill = 0;
        for (double bill : bills) {
            totalBill += bill;
        }
        System.out.println("Total of all bills: $" + totalBill);
    }
}
























