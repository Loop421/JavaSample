/*
 The Distance Between is a program that implements an 
 application that would calculate the distance from
 points user enters and display the distance between them. 
*/

/**
 *
 * @author Esmelin Lopez
 */

import java.util.Scanner;

public class distanceBetween{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        // prompt user to enter first two points
        System.out.print("Enter x1 and y1: ");
        double x1 = in.nextDouble();
        double y1 = in.nextDouble();
        
        // prompt user to enter second two points
        System.out.print("Enter x2 and y2: ");
        double x2 = in.nextDouble();
        double y2 = in.nextDouble();
        
        // this compute the inner part of the formula
        double determinant = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        
        // this compute the whole formula
        double sqrtRoot = Math.pow(determinant, 0.5);
        
        System.out.println("The distance between two point is " + sqrtRoot);
    }
}