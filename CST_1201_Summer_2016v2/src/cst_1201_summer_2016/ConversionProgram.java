/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst_1201_summer_2016;
import java.util.Scanner;
import java.text.*;

/**
 *
 * The Conversion Program implements an application that asks the user
 * to input distance in meter. The application will then ask the user what
 * they would to convert the meter into form a menu that display option of 
 * kilometer, inches, or feet.
 * 
 * @author Esmelin Lopez
 */
public class ConversionProgram {
    public static void main (String[] args)
    {
        double conversion;   // Store calcutation form the method
        double meters;      // Store what user input for meter.
        int select;        //  Menu selection
        Scanner read = new Scanner(System.in);
        DecimalFormat decfor = new DecimalFormat ("0.00");
        
        System.out.println("Enter a distance in meter");
        meters = read.nextDouble();
        // Dose not accept negative number for meters.
        while(meters <0){
            System.out.println("Wrong value. please enter number higher than 0");
            meters = read.nextDouble();
        }
        
        do
        {
            // Display the menu.
            showMenu();
            // Get the what the user select from the option display
            select = read.nextInt();
            // Validate the user select.
            while (select < 1 || select > 4) {
            System.out.print("Invalid selection. Enter your choice: ");
            select = read.nextInt();
            }
            // Process the user input.
            if(select == 1){
                conversion = showKilometer(meters);
                System.out.println("\n" +decfor.format(meters)+" meters is "
                        +decfor.format(conversion)+ " kilometer");}// Output
            else if(select == 2){
                conversion = showInches(meters);
                System.out.println("\n" +decfor.format(meters)+" meters is "
                        +decfor.format(conversion)+ "inches");// Output
            }
            else if(select == 3){
                conversion = showFeet(meters);
                System.out.println("\n" +decfor.format(meters)+" meter is "
                        +decfor.format(conversion)+ " feet");// Output
            }
            else if(select == 4){
                System.out.println("Program has ended");// Output
                break;
            }
        }while(select != 4);
        
        
    }// end of main method.
    
    public static void showMenu()
    {
        // Method to display menu.
        System.out.println("Meter Conversion\n "
                +"1. Convert to kilometers\n "
                +"2. Covert to inches\n "
                +"3. Covert to feet\n "
                +"4. Quit the program\n "
                +"Please select what you want to convert meter to.");
    }// Method for each equation to convert meters.
    public static double showKilometer(double meters)
    {
        double coversion = (meters * 0.001);
        return coversion;
    }
    public static double showInches(double meters)
    {
        double coversion = (meters * 38.37);
        return coversion;
    }
    public static double showFeet(double meters)
    {
        double coversion = (meters * 3.281);
        return coversion;
    }
    
}
