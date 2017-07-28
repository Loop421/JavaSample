/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cst_1201_summer_2016;
import java.util.Scanner;
import java.text.*;

/**
 * The Vacation Planner program implements an application that 
 * that would calculate and display a break down of expenses along
 * with total expense.
 * 
 * @Esmelin Lopez
 */
public class Vacation_Planner {
    public static void main(String[] args)
    {
        //Values
        Scanner input = new Scanner(System.in);
        double hotel, meal,days_stay, miles;
        double gas_cost,daily_rate, MPG,total_meal, total_gas, total_trip;
        DecimalFormat decfor = new DecimalFormat ("0.00");
        
        //Inputs
        System.out.println("Enter how many miles to destinations");
        miles = input.nextDouble();
        System.out.println("Enter how many days you're staying in the hotel");
        days_stay = input.nextDouble();
        System.out.println("Enter the daily rate of the hotel");
        daily_rate = input.nextDouble();
        System.out.println("Enter how you plan to spend for meal per day");
        meal = input.nextDouble();
        System.out.println("Enter the cost of gas per gallon");
        gas_cost = input.nextDouble();
        System.out.println("Enter MPG of your car");
        MPG = input.nextDouble();
        
        //equation 
        hotel = days_stay * daily_rate;
        total_meal = days_stay * meal;
        total_gas = (miles/MPG) * gas_cost;
        total_trip = hotel + total_meal + total_gas;
        
        
        //Outputs
        System.out.println("\nTotal Hotel Cost: $"+ decfor.format(hotel));
        System.out.println("Total Meals Cost: $"+ decfor.format(total_meal));
        System.out.println("Total Gas Cost $"+ decfor.format(total_gas));
        System.out.println("Total Trip Cost $"+ decfor.format(total_trip));
        
        
        
    }
    
}
