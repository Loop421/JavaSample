/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst_1201_summer_2016;

/**
 *
 * @author drcho_000
 */
public class Payroll {
    public static void main(String[] args)
    {
        int hours = 8;
        double grossPay, payRate = 27.0;
        
        grossPay = hours * payRate;
        System.out.println("Your gross pay is $" +grossPay);
    }
    
}
