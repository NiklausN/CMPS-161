/*
 *  Nicholas J. Newport
 *  w0701222
 *  Computer Science 161-01
 *  Dr. Achee, Bonnie
 *  27 April 2020
 *
 *  - Program Information:
 *    1. Function:
 *        This program displays a menu in the console and retrieves the inputted selection from the user. The
 *      program will either count the number of vowels, consonants, or lowercase letters in the inputted string
 *      based on which selection was made by the user.
 */

// Import the Scanner
import java.util.Scanner;

public class NewportNProg5 {

    public static int countVowels(String s) {

        // Count the Number of Vowels in String "s"
        int result = 0;
        for (int lCount = 0; lCount < s.length(); lCount++) {

            if (s.charAt(lCount) == 'a' || s.charAt(lCount) == 'e' || s.charAt(lCount) == 'i'
                    || s.charAt(lCount) == 'o' || s.charAt(lCount) == 'u') {

                // Increase the Result Value
                result++;

            } // End of If Statement

        } // End of For-Loop

        // Return the Result
        return result;

    } // end of countVowels Method

    public static int countConsonants(String s) {

        // Count the Number of Consonants in String "s"
        int result = 0;
        for (int lCount = 0; lCount < s.length(); lCount++) {

            if (s.charAt(lCount) == 'a' || s.charAt(lCount) == 'e' || s.charAt(lCount) == 'i'
                    || s.charAt(lCount) == 'o' || s.charAt(lCount) == 'u') {
            } else {

                // Increase the Result Value
                result++;

            } // End of Else Statement

        } // End of For-Loop

        // Return the Result
        return result;

    } // End of countConsonants Method

    public static int countLowercase(String s) {

        // Count the Number of Lowercase Letters in String "s"
        int result = 0;
        for (int lCount = 0; lCount < s.length(); lCount++) {

            if (Character.isLowerCase(s.charAt(lCount))) {

                result++;

            } // End of If Statement

        } // End of For-Loop

        // Return the Result
        return result;

    } // End of countLowercase Method

    public static void printEvenChars(String s) {

        // Find Which Chars are at an Even Index
        int numOfEChar = 0;
        for (int lCount = 1; lCount < s.length(); lCount += 2) {

            // Increase the Value of numOfEChar
            numOfEChar++;

            // Print the Even Char
            System.out.println("There is an even char at index " + lCount + " and that char is " + s.charAt(lCount));

        } // End of For Loop

        // Display the Number of Even Chars
        System.out.println("There is a total of " + numOfEChar + " even chars.");

    } // End of printEvenChars Method

    public static void main(String[] args) {

        // Declare the Scanner
        Scanner uInput = new Scanner(System.in);

        // Display a List of Options
        System.out.println("| 1 = Count Vowels    | 2 = Count Consonants |");
        System.out.println("| 3 = Count Lowercase | 4 = Print Even Chars |");
        System.out.printf("\t%28s%n", "| 0 = Exit Program |");

        // Retrieve Input from the User
        System.out.print("User: ");
        int uSel = uInput.nextInt();

        if (uSel == 0) {

            // Tell the User Goodbye
            System.out.println("Goodbye! Please come back later...");

            // Exit the Program
            System.exit(0);

        } else {

            // Retrieve a String from the User
            System.out.println("Please enter a string!");
            System.out.print("User: ");
            String s = uInput.next();

            // Use a Switch to Call the Method the User has Selected
            switch (uSel) {

                case 1: // Count Vowels

                    // Determine if there is One Vowel or Multiple
                    String vPSing;
                    if (countVowels(s) == 1) {

                        vPSing = "vowel";

                    } else {

                        vPSing = "vowels";

                    }

                    // Display the Results
                    System.out.println("The string \"" + s +  "\" contains " + countVowels(s) + " " + vPSing);

                    break;

                case 2: // Count Consonants

                    // Determine if there is One Consonant or Multiple
                    String cPSing;
                    if (countConsonants(s) == 1) {

                        cPSing = "consonant";

                    } else {

                        cPSing = "consonants";

                    }

                    // Display the Results
                    System.out.println("The string \"" + s +  "\" contains " + countConsonants(s) + " " + cPSing);

                    break;

                case 3: // Count Lowercase

                    // Determine if there is One Letter or Multiple
                    String lPSing;
                    if (countLowercase(s) == 1) {

                        lPSing = "lowercase letter";

                    } else {

                        lPSing = "lowercase letters";

                    }

                    // Display the Results
                    System.out.println("The string \"" + s +  "\" contains " + countLowercase(s) + " " + lPSing);

                    break;

                case 4: // Print Even Chars

                    printEvenChars(s);

                    // Display the Results

                    break;

                default:

                    // Display an Error Message

            } // End of uSel Switch Statement

        } // End of Else Statement

        // Close the Scanner
        uInput.close();

    } // End of Main Method

} // End of NewportNProg5 Class
