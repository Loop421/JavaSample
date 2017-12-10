package CST_3513_Fall_2017;

/*
Reads three sides for a triangle and computes the input is valid. 
Otherwise, it display that the input is invalid
*/

import java.util.Scanner;

public class triangleSides {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Prompt the user to enter three sides of a triangle
        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
        
        // Compute area if input is valid. Otherwise, display that input is 
        // invaild
        
        System.out.print(isValid(side1, side2, side3) ?
                "The area of the trianle is " + area(side1, side2, side3) :
                "Input is invalid");
        
    } // Main Method
    
    // Method isValid returns true if the sum of any two side is greater than
    // the thrid side.
    
    public static boolean isValid(
        double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s * side2) * (s * side3));
    }
}