/*
 * To generate the wind chill index from the input fo the user
 * wind chill will only be shown if the temperature not below
 * -58 or above 41 and wind speed is below 2mph
 */

/**
 *
 * @author Esmelin Lopez
 */

import java.util.Scanner;


public class windChill {
    
    public static void main(String[] args){
        
        //create Scanner
        Scanner input = new Scanner(System.in);
        
        // rea
        char choice;
        
        do {
        
            //Prompt user and read input
            System.out.print("\nEnter the temperature that not below" +
            " -58 or above 41 in Fahrenheit: ");
            double ta = input.nextDouble();
        
            System.out.print("Enter the wind speed in miles per hour that"
                    + " not below 2mph: ");
            double v = input.nextDouble();
        
       
            //Check if both input are valid or not
            if (v < 2.0 && (ta < -58.0 || ta > 41.0))
                System.out.println("Invalid temperature and wind speed");
        
            // Check if only wind speed input is invalid
            else if ( v < 2.0)
                System.out.println("Invalid wind speed");
        
            // Check if only temperature input is invalid
            else if ( ta < -58.0 || ta > 41.0)
                System.out.println("Invalid temperature");
        
            else {
            
                /* if both input are valid, calculate wind chill index and 
                display a message with output */
                double windChill = 35.74 + (0.6215 * ta) - 
                    (35.75 * Math.pow(v, 0.16)) + (0.4275 * ta * 
                    Math.pow(v, 0.16));
                System.out.println("The Wind chill index is " + windChill);
        }
        
        // to read the user input if they want to try different 
        // temperature and wind speed.
        System.out.println("\nEnter y for another try");
        choice = input.next().charAt(0);
        
        } while (choice == 'Y' || choice == 'y');
    }// close main method
    
}
