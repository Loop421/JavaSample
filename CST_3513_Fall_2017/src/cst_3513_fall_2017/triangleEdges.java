package CST_3513_Fall_2017;

/*
triangleEdges reads the three edges that the user input and compute 
only if the edges are vaild.
*/

/**
 *
 * @author Esmelin Lopez
 * 8/28/2017
 */

import java.util.Scanner;

public class triangleEdges {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        // prompt the user to enter edge of the triangle
        System.out.print("Enter three edge of the triangle");
        
        System.out.print("Edge 1 point x, y: ");
        double x1 = input.nextDouble();
        double y1 = input.nextDouble();
        
        System.out.print("Edge 2 point x, y: ");
        double x2 = input.nextDouble();
        double y2 = input.nextDouble();
        
        System.out.print("Edge 3 point x, y: ");
        double x3 = input.nextDouble();
        double y3 = input.nextDouble();
        
        // comparing the edges to eachother 
        boolean vaild = (x1 + y1 > x3 + y3 && x2 + y2 > x3 + y3) ||
                (x1 + y1 > x2 + y2 && x3 + y3 > x2 + y2) ||
                (x2 + y2 > x1 + y1 && x3 + y3 > x1 + y1);
        
        // checking if the input are vaild
        if (!vaild){
            
            System.out.println("Input is invaild");
            System.exit(1);
        }
        
        // area of the triangle
        double side1 = Math.pow(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2), 0.5);
        double side2 = Math.pow(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2), 0.5);
        double side3 = Math.pow(Math.pow(x1 - x3, 2) + Math.pow(y1 - y3, 2), 0.5);
        
        System.out.println("The perimeter of the triangle is :" + 
                (side1 + side2 + side3 ));
        
    }
}