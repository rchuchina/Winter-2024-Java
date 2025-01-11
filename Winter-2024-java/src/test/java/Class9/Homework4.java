package Class9;

public class Homework4 {
    public static void main(String[] args) {
        /**
         * Question-1:
         * create two variables, one variable stores the studentScore and another variable stores maxScore
         * calculate student percentage ; based on the student percentage, print the student-grade.
         *
         * Grade-A : 91-100%
         * Grade-B : 81-90.99%
         * Grade-C : 71-80.99%
         * Grade-D : 61-70.99%
         * Grade-E : 51-60.99%
         * Grade-F : less than 51%
         *
         * if the studentScore is invalid or greater than maxScore, print "Invalid student score entered"
         *
         *
         * double studentScore = 210
         * int maxScore = 180
         * percentage
         *
         * (studentScore/maxScore)*100
         */
        //double studentScore = 210;
        //double studentScore = 90;
        double studentScore = 35.55;
        int maxScore = 180;
        if (studentScore < 0 || studentScore > maxScore)   {
            System.out.println("Invalid student score entered");
        } else {
            // Calculate the percentage
            double percentage = (studentScore / maxScore) * 100;
            // Determine the grade
            char grade;
            if (percentage >= 91) {
                grade = 'A';
            } else if (percentage >= 81) {
                grade = 'B';
            } else if (percentage >= 71) {
                grade = 'C';
            } else if (percentage >= 61) {
                grade = 'D';
            } else if (percentage >= 51) {
                grade = 'E';
            } else {
                grade = 'F';
            }
            // Print the results
            //System.out.printf("Student Percentage: %.2f%%\n", percentage);
            System.out.printf("Student Percentage :  = " +percentage + "  " );
            System.out.println("Student Grade: " + grade);
          }



        /**
         * Question-2:
         * Create a variable (myNumber) and store any value in it.
         * if the myNumber is divisible by 5, print "divisible by 5"
         * if the myNumber is divisible by 3, print "divisible by 3"
         * if the myNumber is divisible by 5 and by 3, print "divisible by 5 and 3"
         * if the myNumber is NOT divisible by 5 and by 3, print the value in myNumber
         *
         * int myNumber = 15;
         */
        int myNumber = 15;
        //int myNumber = 10;
        //int myNumber = 12;
        //int myNumber = 13;
        if (myNumber % 5 == 0 && myNumber % 3 == 0) {
            System.out.println("myNumber  =  " +myNumber );
            System.out.println("divisible by 5 and 3");
        } else if (myNumber % 5 == 0) {
            System.out.println("myNumber  =  " +myNumber );
            System.out.println("divisible by 5");
        } else if (myNumber % 3 == 0) {
            System.out.println("myNumber  =  " +myNumber );
            System.out.println("divisible by 3");
        } else {
            System.out.println("myNumber  =  " +myNumber );
        }
    }
}
