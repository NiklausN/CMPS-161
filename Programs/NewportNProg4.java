/*
 *  Nicholas J. Newport
 *  W0701222
 *  Computer Science 161-01
 *  Dr. Achee, Bonnie
 *  25 March 2020
 *
 *  This program reads the Employees Name (First and Last Name), Number of Hours Worked, Hourly Rate of Pay,
 *  Federal Tax Withholding as a Percentage, and State Tax Withholding as a Percentage then parses the String that
 *  stores the Employee's Name to store the First Name in a String Instance Variable named firstName and the Last Name
 *  in a String Instance Variable named lastName. The program also generates an Employee ID that is stored in a String
 *  Instance Variable Consisting of the Employee's first initial, last initial, and three random single digit integers
 *  and displays a payroll statement consisting of the Employee Last Name, Employee First Name, Employee ID, Hours
 *  Worked, Gross Pay, Deductions: "Federal Withholding, State Withholding, and Total Withholding", and Net Pay.
 *
 *  Error Checking:
 *       1. If the user enters a negative number for hours worked, pay rate, federal tax withholding or state tax
 *          withholding, you should print out an error message and exit the program.
 *       2. Valid federal tax brackets are 10%, 12%, 22%, 24%, 32%, 35% and 37%. If the user enters an invalid
 *          tax bracket, you should print out an error message and exit the program.
 *       3. Valid state tax brackets are 2%, 4% and 6%. If the user enters an invalid tax bracket, you should print
 *          out an error message and exit the program.
 */

// Import the Scanner
import java.util.Scanner;

public class NewportNProg4 {

    public static void main(String[] args) {

        // Declare the Scanner
        Scanner assistant = new Scanner(System.in);

        // Prompt the User to Enter Required Information
        System.out.print("Enter the First and Last Name: ");
        String firstName = assistant.next();
        String lastName = assistant.next();
        System.out.print("Enter the Hourly Rate of Pay: ");
        double payRate = assistant.nextDouble();
        System.out.print("Enter the Number of Hours Worked: ");
        double hoursWorked = assistant.nextDouble();
        System.out.println("Federal Tax Brackets are 10%, 12%, 22%, 24%, 32%, 35%, and 37%.");
        System.out.print("Federal Tax Withholding: ");
        int federalTaxWithholding = assistant.nextInt();
        System.out.println("State Tax Withholding Brackets are 2%, 4%, and 6%.");
        System.out.print("State Tax Withholding: ");
        int stateTaxWithholding = assistant.nextInt();

        // Generate Employee ID
        int r1 = (int)(Math.random() * 10);
        int r2 = (int)(Math.random() * 10);
        int r3 = (int)(Math.random() * 10);
        String employeeID = firstName.substring(0, 1) + lastName.substring(0, 1) + r1 + r2 + r3;

        // Compute Gross Pay
        double grossPay = -1;
        if (payRate >= 0) {

            if (hoursWorked >= 0) {

                grossPay = payRate * hoursWorked;

            } // End of If Statement
            else {

                System.out.println("Please rerun the program and enter a positive and valid number for Hours Worked!");
                System.exit(1);

            } // End of Else Statement

        } // End of If Statement
        else {

            System.out.println("Please rerun the program and enter a positive and valid number for Pay Rate!");
            System.exit(1);

        } // End of Else Statement

        // Compute Federal Tax Withheld
        double totalFTax = -1;
        if (federalTaxWithholding >= 0) {

            switch (federalTaxWithholding) {

                case 10:

                    totalFTax = grossPay * 0.10;

                    break;

                case 12:

                    totalFTax = grossPay * 0.12;

                    break;

                case 22:

                    totalFTax = grossPay * 0.22;

                    break;

                case 24:

                    totalFTax = grossPay * 0.24;

                    break;

                case 32:

                    totalFTax = grossPay * 0.32;

                    break;

                case 35:

                    totalFTax = grossPay * 0.35;

                    break;

                case 37:

                    totalFTax = grossPay * 0.37;

                    break;

                default:

                    System.out.println("Please rerun the program and enter a valid tax bracket that has been listed!");
                    System.exit(1);

                    break;

            } // End of Switch Statement

        } // End of If Statement
        else {

            System.out.println("Please rerun the program and enter a positive and valid number for Federal Withholding!");
            System.exit(1);

        } // End of Else Statement

        // Compute State Tax Withheld
        double totalSTax = -1;
        if (stateTaxWithholding >= 0) {

            switch (stateTaxWithholding) {

                case 2:

                    totalSTax = grossPay * 0.02;

                    break;

                case 4:

                    totalSTax = grossPay * 0.04;

                    break;

                case 6:

                    totalSTax = grossPay * 0.06;

                    break;

                default:

                    System.out.println("Please rerun the program and enter a valid state tax bracket that has been listed!");
                    System.exit(1);

                    break;

            } // End of Switch Statement

        } // End of If Statement
        else {

            System.out.println("Please rerun the program and enter a positive and valid number for State Withholding!");
            System.exit(1);

        } // End of Else Statement

        // Compute Total Deductions
        double totalDeductions = totalFTax + totalSTax;

        // Compute Net Pay
        double netPay = grossPay - totalDeductions;

        // Display the Results
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.printf("Pay Rate: $%.2f\n", payRate);
        System.out.printf("Gross Pay: $%.2f\n", grossPay);
        System.out.println("Deduction Information:");
        System.out.printf("  - Federal Withholding: %d%%%n", federalTaxWithholding);
        System.out.printf("     - Total Federal Deduction: $%.2f%n", totalFTax);
        System.out.printf("  - State Withholding: %d%%%n", stateTaxWithholding);
        System.out.printf("     - Total State Deduction: $%.2f%n", totalSTax);
        System.out.printf("  - Total Deductions: $%.2f%n", totalDeductions);
        System.out.printf("Net Pay: $%.2f%n", netPay);

        // Terminate the Scanner
        assistant.close();

    } // End of Main Method

} // End of NewportNProg4 Class
