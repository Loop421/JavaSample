/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst_1201_summer_2016;
import java.util.Scanner;
import java.text.*;

/**
 * The Cell Phone Bill program implements an application that 
 * that would calculate and display base on user input 
 * a break down of their phone bill. 
 * 
 *
 * @Esmelin Lopez
 */
public class cellPhoneBill {
    public static void main(String[] args)
    {
        // Scanner object for keyboard input.
        Scanner console = new Scanner (System.in);
        // Decimal Format for money value
        DecimalFormat decfor = new DecimalFormat ("0.00");
        char plan;
        
        System.out.println("Please enter account number");
        int acctNum = console.nextInt();
        // repeat when account number is out of range
        while(acctNum < 0 || acctNum > 9999){
        System.out.println("Invalid input. Please try again.");
        acctNum = console.nextInt();
    }
        System.out.println("Enter minutes used: ");
        int minuteUsed = console.nextInt();
        System.out.println("Please choose you plan type by entering"
                + " R or r for Regular and P or p for Premium");
        plan = console.next().charAt(0);
        
        // a Switch for the two different service.
        switch (plan){
            case 'p': case 'P':
            {
                int premDMins, premNMins;
                System.out.println("Please enter amount of"
                        + " day time (6AM-6PM) minutes used this month.");
                premDMins = console.nextInt();
                System.out.println("Please enter amount of"
                        + " night time (6PM-6AM) minutes used this month.");
                premNMins = console.nextInt();
                // When both night and day minutes goes over
                if (premNMins > 100 && premDMins > 75)
                {
                    // This is for the charge if the user go over 75 mintues
                    double chargeDay = (premDMins - 75)* .10 + 25.00;
                    // This is for the charge if the user go over 100 mintues
                    double chargeNight = (premNMins - 100)* .05 + 25.00;
                    double totalCharge = chargeDay + chargeNight;
                    
                    System.out.println("Your account number is: "+ acctNum);
                    System.out.println("Your service plan is Premium plan");
                    System.out.println("Mintues used: "+ minuteUsed);
                    System.out.println("Daytime mintues used "+ premDMins);
                    System.out.println("Night time mintues used "+ premNMins);
                    System.out.println("Amount due: $"+ decfor.format(totalCharge));
                    break;
                }
                // When only Night minute gose over.
                if (premNMins > 100)
                {
                    double chargeNight = (premNMins - 100)* .05 + 25.00;
                    
                    System.out.println("Your account number is: "+ acctNum);
                    System.out.println("Your service plan is Premium plan");
                    System.out.println("Mintues used: "+ minuteUsed);
                    System.out.println("Daytime mintues used "+ premDMins);
                    System.out.println("Night time mintues used "+ premNMins);
                    System.out.println("Amount due: $"+ decfor.format(chargeNight));
                    break;
                }
                //When only Day minute goes over.
                if (premDMins > 75)
                {
                    double chargeDay = (premDMins - 75)* .10 + 25.00;
                    
                    
                    System.out.println("Your account number is: "+ acctNum);
                    System.out.println("Your service plan is Premium plan");
                    System.out.println("Mintues used: "+ minuteUsed);
                    System.out.println("Daytime mintues used "+ premDMins);
                    System.out.println("Night time mintues used "+ premNMins);
                    System.out.println("Amount due: $"+ decfor.format(chargeDay));
                    break;
                }
                else
                {
                    System.out.println("Your account number is: "+ acctNum);
                    System.out.println("Your service plan is Premium plan");
                    System.out.println("Mintues used: "+ minuteUsed);
                    System.out.println("Daytime mintues used "+ premDMins);
                    System.out.println("Night time mintues used "+ premNMins);
                    System.out.println("Amount due: $25.00");
                    break;
                }
            }
            case 'r': case 'R':
            {
                
                if(minuteUsed > 50)
                {
                    // This is charges for user that goes over 50 minutes.
                    double regCharge = (minuteUsed - 50)* .20 + 10.00;
                    
                    System.out.println("Your account number is: "+ acctNum);
                    System.out.println("Your service plan is Regular plan");
                    System.out.println("Mintues used: "+ minuteUsed);
                    System.out.println("Amount due: "+ decfor.format(regCharge));
                    break;
                }
                else
                {
                    System.out.println("Your account number is: "+ acctNum);
                    System.out.println("Your service plan is Regular plan");
                    System.out.println("Mintues used: "+ minuteUsed);
                    System.out.println("Amount due: $10.00");
                    
                    break;
                    
                }
            }
            default:
            {
              System.out.println("You have enterd an invalid service type. Please try again.");
            }
        }
 
    }
    
}
