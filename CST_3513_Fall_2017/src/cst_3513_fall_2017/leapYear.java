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

public class leapYear {
    public static void main(String[] args){
        
        System.out.println("All the leap years from 101 to 2100: ");
        
        int count = 0;
        
        for (int year = 101; year <= 2100; year++) {
            
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
                count++;
                
                //Ten results per line separated by exactly one space
                System.out.print(year + (count % 10 == 0 ? "\n " : " "));
                
            }
        }
        System.out.println();
    }
    
}
