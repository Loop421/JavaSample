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
public class perfectNumber {
    public static void main(String[] args) {
        
        System.out.println("The four perfect number less than 10,000: ");
        
        int sum; // Holds the sum of the positive divisors
        
        // Find all perfect numbers less than 10,000
        for (int i = 1; i < 10000; i++){
            sum = 0; // Reset Accmulator to 0
            
            for (int k = 1; k < i; k++) {
                
                //Test for divisor
                if (i % k == 0)
                    
                    sum += k;
            }
            // Test if sum of all positive divisors are equal to number
            if (i == sum) 
                System.out.printf("%20d\n", i);
            
           // for (int number = 1; number <= 10000; number++) {
                //boolean isPerfectNumber = i == sum;
                
            //}
        }
    }
}
