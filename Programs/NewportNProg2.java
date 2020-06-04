/*
 *  Nicholas J. Newport
 *  W0701222
 *  Computer Science 161-01
 *  Dr. Bonnie Achee
 *  7 February 2020
 *
 *  This program computes the future value of the principal vested
 *  amount using the equation "FIV = IA(1 + MIR)^(NOY)(12)". It prompts
 *  users to enter the required values into the console.
 */

package Programs;

// Import the Scanner
import java.util.Scanner;

public class NewportNProg2 {

    public static void main(String[] args) {

        // Create a Scanner
        Scanner Prompt = new Scanner(System.in);

        // Declare the Inputs
        double initialVestedAmount;
        double annualInterestRate;
        double numberOfYears;
        double futureInvestmentValue;

        // Prompt User to Enter Required Values
        System.out.println("What is the Initial Amount Invested?");
        initialVestedAmount = Prompt.nextDouble();
        System.out.println("What is the Annual Interest Rate Imposed?");
        annualInterestRate = Prompt.nextDouble();
        System.out.println("What is the Number of Years the Amount will Settle?");
        numberOfYears = Prompt.nextDouble();
        Prompt.close();

        // Compute the Monthly Interest
        final double monthlyInterestRate = (annualInterestRate / 12) / 100;

        // Compute the Future Value of the Investment
        futureInvestmentValue = initialVestedAmount * Math.pow( ( 1 + monthlyInterestRate), ( numberOfYears * 12 ) );

        // Display the Results
        System.out.println("The value of the investment will be $" + futureInvestmentValue + " over the course of "
                + numberOfYears + " year(s) if the Annual Interest Rate is " + annualInterestRate
                + " and the Initial Investment Amount is $" + initialVestedAmount);

        // Close the Scanner
        Prompt.close();

    } // End of Main Method

} // End of NewportNProg2 Class
