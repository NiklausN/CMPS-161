/*
 *  Nicholas J. Newport
 *  W0701222
 *  CMPS 161-01
 *  Dr. Bonnie Achee
 *  29 January 2020
 *
 *  This program computes and displays the area
 *  and circumference of a circle using the radius.
 *
 *  circumference = 2 * radius * pi
 *  area = radius * radius * * pi
 *         (pi = 3.14159)
 */

public class NewportNProg1 {

    public static void main(String[] args) {

        // Assign Values
        double radius = 5.5;
        final double PI = 3.14159;

        // Compute the Area of a Circle
        double area = radius * radius * PI;

        // Compute the Circumference of a Circle
        double circumference = 2 * radius * PI;

        // Display the Results
        System.out.println("The Circumference of the Circle with a Radius of " + radius
                + "cm is " + circumference + "cm.");
        System.out.println("The Area of the Circle with a Radius of " + radius
                + "cm is " + area + "cm^2.");

    } // End of Main Method

} // End of NewportNProg1 Class
