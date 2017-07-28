/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst_1201_summer_2016;
import java.util.Scanner;
import java.text.*;


/**
 * The RainFall program implements an application that would calculate the users 
 * input years and rainfall in inches for each month. To display the average 
 * rainfall for the given years.
 * 
 *
 a* Esmelin Lopez
 */
public class rainFall {
    public static void main(String[] args)
    {
        DecimalFormat decfor = new DecimalFormat ("0.00");
        Scanner keyboard = new Scanner(System.in);
        int years, month = 12;
        double total = 0, average, monthRain;
        
        // user input for years
        System.out.print("Enter number of years :");
        years = keyboard.nextInt();
        // Validate the input
        while(years < 1){
            System.out.println("Invalid. Enter 1 or greater: ");
            years = keyboard.nextInt();
        }
        System.out.println("Enter the rainfall, in inches, "
                + "for each month");
        
        for(int y = 1; y <=years; y++) {
            
            for (int m = 1; m <= month; m++){
            
            // User input of rainfall for each month.    
            System.out.print("Year " + y + " month " + m + ": ");
            monthRain = keyboard.nextDouble();
            // Validate the input
            while(monthRain < 0){
                System.out.println("Invalid. Enter 1 or greater: ");
                monthRain = keyboard.nextDouble();
            }
              
              total += monthRain;
            }
            }
            // Average calculation for rainfall in a year.
            average = total / month;
            // Display the statistics.
            System.out.println("\nNumber of month: " + (years * month));
            System.out.println("Total rainfall: " + decfor.format(total));
            System.out.println("Average monthly rainfall: " + decfor.format(average));
        }
    }

        
              
            
            
              
             
        