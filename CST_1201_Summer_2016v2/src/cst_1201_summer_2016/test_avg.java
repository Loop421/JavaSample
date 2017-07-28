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
public class test_avg {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double test1, test2, test3, Avg;
        
        System.out.println("Enter score for test 1");
        test1 = input.nextDouble();
        System.out.println("\nEnter score for test 2");
        test2 = input.nextDouble();
        System.out.println("\nEnter score for test 3");
        test3 = input.nextDouble();
        
        Avg = (test1 + test2 + test3) / 3;
        
        System.out.println("\nYour test score average is " + Avg);
        
    }

           
    
}
