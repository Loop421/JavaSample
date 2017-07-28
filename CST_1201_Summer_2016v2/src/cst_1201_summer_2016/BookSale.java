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
public class BookSale {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        double price;
        double tax, total, grand_total;
        
        System.out.println("Enter the price");
        price = input.nextDouble();
        System.out.println("Enter number of books");
        num = input.nextInt();
        
        total = price * num;
        tax = total * 0.083;
        grand_total = tax + total;
        
        System.out.println("\nTotal: $"+ total);
        System.out.println("Tax: $"+ tax);
        System.out.println("Grand total: $"+ grand_total);
        
        
        
        
        
    }
    
}
