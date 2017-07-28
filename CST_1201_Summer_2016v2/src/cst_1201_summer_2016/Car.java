/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cst_1201_summer_2016;
import java.util.Scanner;


/**
 *
 * @author class
 */
public class Car {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int miles, gas;
        double mpg;
        
        System.out.println("Enter number miles driven");
        miles = input.nextInt();
        System.out.println("Enter number of gallon of gas used");
        gas = input.nextInt();
        
        mpg = (double) miles / gas;
        
        System.out.println("Miles per gallon " + mpg);
        
        
    }
    
}
