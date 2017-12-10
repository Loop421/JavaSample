/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst_3513_fall_2017;

/**
 *
 * @author drcho_000
 */

import java.util.Scanner;

public class decToBin {
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
        
        // Prompt the user to enter a decimal integer
        System.out.print("Enter a decimal interger: ");
        int decimal = input.nextInt();
        
        // Convert the decimal number to a binary number
        String binary = ""; // Holds the binary value
        for (int i = decimal; i > 0; i /= 2){
            binary = (i % 2) + binary;
        }
        
        // Display the corresponding binary value of the decimal integer
        System.out.println(
                "The binary value of the decimal \" " + decimal + "\" is: " +
                        binary);
    }
}
