/*
 *  Nicholas J. Newport
 *  W0701222
 *  Computer Science 161-01
 *  Dr. Bonnie Achee
 *  11 March 2020
 *
 *  This program is a Rock-Paper-Scissors-Lizard-Spock Game that generates a number from 0 to 4 to represent the
 *  computers move and then prompts the user to enter a number from 0 to 4 as the users move then compares both
 *  responses then displays the winner otherwise prompts the error message then exits the program.
 *
 *      Rules of the Game:
 *  1.) Scissors cuts Paper
 *  2.) Paper covers Rock
 *  3.) Rock crushes Lizard
 *  4.) Lizard poisons Spock
 *  5.) Spock bends Scissors
 *  6.) Scissors decapitates Lizard
 *  7.) Lizard eats Paper
 *  8.) Paper disproves Spock
 *  9.) Spock vaporizes Rock
 *  10.) Rock crushes Scissors
 */

package Programs;

// Import the Scanner
import java.util.Scanner;

public class NewportNProg3 {

    public static void main(String[] args) {

        // Create the Scanner
        Scanner input = new Scanner(System.in);

        // Generate a Number from 0 to 4
        int randomNumber = (int)(Math.random() * 5);

        // Prompt User to Enter Information into the Console
        System.out.println("Enter the number from the list below to select your move.");
        System.out.println("0 = Rock | 1 = Paper | 2 = Scissors | 3 = Lizard | 4 = Spock");
        System.out.print("User: ");
        int usersMove = input.nextInt();

        // Create a Switch Statement to Determine Winner and Display Results
        switch (usersMove) {

            case 0:

                switch (randomNumber) {

                    case 0:

                        System.out.println("You chose Rock and the Computer chose Rock. It's a tie!");

                        break;

                    case 1:

                        System.out.println("Paper covers Rock. You lose!");

                        break;

                    case 2:

                        System.out.println("Rock crushes Scissors. You win!");

                        break;

                    case 3:

                        System.out.println("Rock crushes Lizard. You win!");

                        break;

                    case 4:

                        System.out.println("Spock vaporizes Rock. You lose!");

                } // End of Rock Switch

                break;

            case 1:

                switch (randomNumber) {

                    case 0:

                        System.out.println("Paper covers Rock. You win!");

                        break;

                    case 1:

                        System.out.println("You chose Paper and the Computer chose Paper. It's a tie!");

                        break;

                    case 2:

                        System.out.println("Scissors cuts Paper. You Lose!");

                        break;

                    case 3:

                        System.out.println("Lizard eats Paper. You lose!");

                        break;

                    case 4:

                        System.out.println("Paper disproves Spock. You win!");

                } // End of Paper Switch

                break;

            case 2:

                switch (randomNumber) {

                    case 0:

                        System.out.println("Rock crushes Scissors. You lose!");

                        break;

                    case 1:

                        System.out.println("Scissors cuts Paper. You win!");

                        break;

                    case 2:

                        System.out.println("You chose Scissors and the Computer chose Scissors. It's a tie!");

                        break;

                    case 3:

                        System.out.println("Scissors decapitates Lizard. You win!");

                        break;

                    case 4:

                        System.out.println("Spock bends Scissors. You lose!");

                } // End of Scissor Switch

                break;

            case 3:

                switch (randomNumber) {

                    case 0:

                        System.out.println("Rock crushes Lizard. You lose!");

                        break;

                    case 1:

                        System.out.println("Lizard eats Paper. You lose!");

                        break;

                    case 2:

                        System.out.println("Scissors decapitates Lizard. You win!");

                        break;

                    case 3:

                        System.out.println("You chose Lizard and the Computer chose Lizard. It's a tie!");

                        break;

                    case 4:

                        System.out.println("Lizard poisons Spock. You win!");

                } // End of Lizard Switch

                break;

            case 4:

                switch (randomNumber) {

                    case 0:

                        System.out.println("Spock vaporizes Rock. You win!");

                        break;

                    case 1:

                        System.out.println("Paper disproves Spock. You lose!");

                        break;

                    case 2:

                        System.out.println("Spock bends Scissors. You win!");

                        break;

                    case 3:

                        System.out.println("Lizard poisons Spock. You lose!");

                        break;

                    case 4:

                        System.out.println("You chose Spock and the Computer chose Spock. It's a tie!");

                } // End of Spock Switch

                break;

            default:
                System.out.println("There was an error! Please run the program another time and try again.");
                System.exit(1);

        } // End of Main Switch

        // Close the Scanner
        input.close();

    } // End of Main Method

} // End of NewportNProg3 Class
