package CST_3513_Fall_2017;
/*
Investment is a program that reads investment amount, interest rate
and number of years which are base on user input and display future
investment value.
*/

/**
 *
 * @author Esmelin Lopez
 */

import java.util.Scanner;

public class investment {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        /*
        Prompt the user to enter the investment amount,
        annual interest rate and number of years.
        */
        System.out.print("Enter an investment amount: ");
        double amount = input.nextDouble();
        
        System.out.print("Enter annual interest rate in percentage: ");
        double interestRate = input.nextDouble();
        
        // Compute interest for annual 
        interestRate /= 1200;
        
        System.out.print("Enter number of years: ");
        int years = input.nextInt();
        
        // Formula for future investment value
        double futureAmount = amount * Math.pow(1 + interestRate, years * 12);
        
        System.out.println("Accumulated value is $" + futureAmount);
    }
}