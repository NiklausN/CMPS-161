/*
 *  Nicholas J. Newport
 *  w0701222
 *  Computer Science 161-01
 *  Dr. Achee, Bonnie
 *  2 May 2020
 *
 *  Program Information:
 *    - Function:
 *      This program...
 */

package Programs;

// Import the Scanner
import java.util.Scanner;

public class NewportNProg6 {

    public static void disNameScoreInc(String[] names, double[] scores) {

        // Sort the Scores with Names in Increasing Order
        String sTemp;
        double dTemp;
        int z;
        for (int i = 1; i < scores.length; i++) {

            for (int j = i; j > 0; j--) {

                z = i;

                if (scores[j] < scores[j - 1]) {

                    dTemp = scores[j];
                    scores[j] = scores[j - 1];
                    scores[j - 1] = dTemp;

                    sTemp = names[z];
                    names[z] = names[i - 1];
                    names[z - 1] = sTemp;

                } // End of If Statement

            } // End of For Loop

        } // End of For Loop

        // Display the Scores
        for (int i = 0; i < scores.length; i++) {

            System.out.println(names[i] + " = " + scores[i]);

        } // End of For Loop

    } // End of disNameScoreInc Method

    public static void disNameScoreDec(String[] names, double[] scores) {

        // Sort the Scores with Names in Increasing Order
        String sTemp;
        double dTemp;
        int z;
        for (int i = 1; i < scores.length; i++) {

            for (int j = i; j < 0; j++) {

                z = i;

                if (scores[j] > scores[j + 1]) {

                    dTemp = scores[j];
                    scores[j] = scores[j + 1];
                    scores[j + 1] = dTemp;

                    sTemp = names[z];
                    names[z] = names[i + 1];
                    names[z + 1] = sTemp;

                } // End of If Statement

            } // End of For Loop

        } // End of For Loop

        // Display the Scores
        for (int i = 0; i < scores.length; i++) {

            System.out.println(names[i] + " = " + scores[i]);

        } // End of For Loop

    } // End of disNameScoreDec Method

    public static void changeScore(String[] names, double[] scores) {

        // Declare the Scanner
        Scanner csInput = new Scanner(System.in);

        // Display the Names of Inputted Students
        System.out.println("Which student would you like to change the score for?");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < names.length; i++) {

            // Display the Name and Number of the Student
            System.out.println(i + " = " + names[i]);

        } // End of For Loop
        System.out.println("-----------------------------------------------------");

        // Retrieve Which Student Needs their Score to Be Changed
        System.out.print("User: ");
        int selStu = csInput.nextInt();

        // Retrieve What the Score Needs to be Changed to
        System.out.println("What does the score need to be changed to?");
        System.out.print("User: ");
        double chaScore = csInput.nextDouble();

        // Change the Score
        scores[selStu] = chaScore;

    } // End of changeScore Method

    public static void displayScore(String[] names, double[] scores) {

        // Declare the Scanner
        Scanner dsInput = new Scanner(System.in);

        // Display the Names of Inputted Students
        System.out.println("Which student would you like to display the score for?");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < names.length; i++) {

            // Display the Name and Number of the Student
            System.out.println(i + " = " + names[i]);

        } // End of For Loop
        System.out.println("-----------------------------------------------------");

        // Retrieve Which Student's Score Needs to be Displayed
        System.out.print("User: ");
        int selStu = dsInput.nextInt();

        // Display the Students Score
        System.out.println(names[selStu] + "'s score is " + scores[selStu]);

    } // End of displayScore Method

    public static void reportScoreAverage(double[] scores) {

        // Compute the Average Score
        double sAdd = 0;
        for (int i = 0; i < scores.length; i++) {

            // Add the Scores
            sAdd = sAdd + scores[i];

        } // End of For Loop
        double aver = sAdd / scores.length;

        // Display the Average Score
        System.out.println("The average score is " + aver);

    } // End of reportScoreAverage Method

    public static void reportAboveAverage(String[] names, double[] scores) {

        // Compute the Average Score
        double sAdd = 0;
        for (int i = 0; i < scores.length; i++) {

            // Add the Scores
            sAdd = sAdd + scores[i];

        } // End of For Loop
        double aver = sAdd / scores.length;

        // Find Which Students are Above the Average Score

        // Display the Students that are Above the Average Score

    } // End of reportAllAboveAverage Method

    public static void reportBelowAverage(String[] names, double[] scores) {

        // Compute the Average Score
        double sAdd = 0;
        for (int i = 0; i < scores.length; i++) {

            // Add the Scores
            sAdd = sAdd + scores[i];

        } // End of For Loop
        double aver = sAdd / scores.length;

        // Find Which Students are Below the Average Score

        // Display the Students that are Below the Average Score

    } // End of reportAllAboveAverage Method

    public static void main(String[] args) {

        // Declare the Scanner
        Scanner uInput = new Scanner(System.in);

        // Retrieve the Number of Students from User
        System.out.println("How many students are there?");
        System.out.print("User: ");
        int numStudents = uInput.nextInt();

        // Create an Array for the Names of the Students
        String[] names = new String[numStudents];

        // Retrieve the Names of Students from User
        for (int i = 0; i < names.length; i++) {

            // Correct the Student Number for User
            int stu = i + 1;

            // Retrieve the Name of Student "i"
            System.out.println("What is the name of Student " + stu + "?");
            System.out.print("User: ");
            names[i] = uInput.next();

        } // End of Names For Loop

        // Create an Array for the Scores of the Students
        double[] scores = new double[numStudents];

        // Retrieve the Scores of Each Student from User
        for (int i = 0; i < names.length; i++) {

            // Retrieve the Score of Student "i"
            System.out.println("What is " + names[i] + "'s score?");
            System.out.print("User: ");
            scores[i] = uInput.nextDouble();

        } // End of Scores For Loop

        // Start a Do-While Loop
        do {

            // Display a Menu to the User
            System.out.println("+---- Enter one of the following commands listed below: ----+");
            System.out.println("| 1 = Display Names & Scores in Increasing Order of Scores  |");
            System.out.println("| 2 = Display Names & Scores in Decreasing Order of Scores  |");
            System.out.println("| 3 = Change a Student's Score                              |");
            System.out.println("| 4 = Display a Student's Score                             |");
            System.out.println("| 5 = Report the Average Score                              |");
            System.out.println("| 6 = Report All Scores Above the Average                   |");
            System.out.println("| 7 = Report All Scores Below the Average                   |");
            System.out.println("| 8 = Exit the Program                                      |");
            System.out.println("+-----------------------------------------------------------+");

            // Retrieve the Selection from the User
            System.out.print("User: ");
            int uSel = uInput.nextInt();

            // Execute the Selection Made by the User
            switch (uSel) {

                // Display Names & Scores in Increasing Order of Scores
                case 1:

                    // Call the disNameScoreInc Method
                    disNameScoreInc(names, scores);

                    break;

                // Display Names & Scores in Decreasing Order of Scores
                case 2:

                    // Call the disNameScoreDec Method
                    disNameScoreDec(names, scores);

                    break;

                // Change a Student's Score
                case 3:

                    // Call the changeScore Method
                    changeScore(names, scores);

                    break;

                // Display a Student's Score
                case 4:

                    // Call the displayScore Method
                    displayScore(names, scores);

                    break;

                // Report the Average Score
                case 5:

                    // Call the reportScoreAverage Method
                    reportScoreAverage(scores);

                    break;

                // Report All Scores Above the Average
                case 6:

                    // Call the reportAboveAverage Method
                    reportAboveAverage(names, scores);

                    break;

                // Report All Scores Below the Average
                case 7:

                    // Call the reportBelowAverage Method
                    reportBelowAverage(names, scores);

                    break;

                // Exit the Program
                case 8:

                    // Say Farewell to the User
                    System.out.println("Thank you for coming! Please come again later!");

                    // Close the Scanner
                    uInput.close();

                    // Terminate the Program
                    System.exit(0);

                    break;

                // Other Input
                default:

                    // Display Error Message
                    System.out.println("Error: Invalid Selection... Please type the number of a valid option listed in the menu.");

            } // End of uSel Switch

        } while (true);

    } // End of Main Method

} // End of NewportNProg6
