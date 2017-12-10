package CST_3513_Fall_2017;

/*
discriminantEquation compute the three values that a users enter
and display the result based on the discriminant. The result that 
are display is base on if it positive where two root are display, 
if it equal to zero it will display one root and when it negative 
no root is display
*/

/**
 *
 * @author Esmelin Lopez
 * 8/28/2017
 */

import java.util.Scanner;

public class discriminantEquation {
    public static void main(String[] args) {
        
        // Create a Scanner
        Scanner input = new Scanner(System.in);
        
        // Ask user to enter values for a, b and c.
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        
        // Compute the discriminant of the quadriatic equation.
        double discriminant = Math.pow(b, 2) - 4 * a * c;
        
        // if the discriminant is positive
        if (discriminant > 0) {
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            double root2 = (-b - Math.pow(discriminant, 0.5)) / (2 * a);
            
            System.out.println("two roots " + root1 + " and " + root2);
        }
        // if the discriminant is zero
        else if (discriminant == 0) {
            
            double root1 = (-b + Math.pow(discriminant, 0.5)) / (2 * a);
            System.out.println("one root " + root1);
        
        // if there not root    
        } else {
            
            System.out.println("no real roots");
        }
    }
}