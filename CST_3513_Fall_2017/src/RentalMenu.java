/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drcho_000
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RentalMenu {
    
    boolean exit;
    
    public static void main(String[] args) {
        RentalMenu menu = new RentalMenu();
        menu.runRentalMenu();
    }

    public void runRentalMenu() {
        printHeader();
        while (!exit) {
            printMenu();
            int choice = getMenuChoice();
            performAction(choice);
            while (choice == 1)
            {
                printMenu2();
                int pick = getMenuChoice2();
                performAction2(pick);
                break;
                
            }
            
        }
    }

    private void printHeader() {
        System.out.println("+-----------------------------+");
        System.out.println("|    Welcome to steamBuger    |");
        System.out.println("|      Movie Rental App       |");
        System.out.println("+-----------------------------+");
    }

    private void printMenu() {
        displayHeader("Please make a selection");
        System.out.println("1) Rent a movie");
        System.out.println("2) Movie return");
        System.out.println("0) Exit");
    }

    private int getMenuChoice() {
        Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please.");
            }
            if (choice < 0 || choice > 2) {
                System.out.println("Choice outside of range. Please chose again.");
            }
        } while (choice < 0 || choice > 2);
        return choice;
    }

    private void performAction(int choice) {
        switch (choice) {
            case 0:
                System.out.println("Thank you for using our application.");
                System.exit(0);
                break;
            
            case 1: 
                getMenuChoice2();
                break;
           
            case 2:
                
                break;
           
            default:
                System.out.println("Unknown error has occured.");
        }
    }

    private void displayHeader(String message){
        System.out.println();
        int width = message.length() + 6;
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for(int i = 0; i < width; ++i){
            sb.append("-");
        }
        sb.append("+");
        System.out.println(sb.toString());
        System.out.println("|   " + message + "   |");
        System.out.println(sb.toString());
    }
    
    private void printMenu2() {
        displayHeader("Please select Gener");
        System.out.println("1) Comedy");
        System.out.println("2) Drama");
        System.out.println("3) Action");
        System.out.println("0) Exit");
    }
    
    private int getMenuChoice2() {
        Scanner keyboard = new Scanner(System.in);
        int pick = -1;
        do {
            System.out.print("Enter your choice: ");
            try {
                pick = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Numbers only please.");
            }
            if (pick < 0 || pick > 3) {
                System.out.println("Choice outside of range. Please chose again.");
            }
        } while (pick < 0 || pick > 3);
        return pick;
    }
    
    private void performAction2(int pick) {
        switch (pick) {
            case 0:
                System.out.println("Thank you for using our application.");
                System.exit(0);
                break;
            case 1: 
                System.out.println("Comedy");
                break;
            case 2:
                System.out.println("Drama");
                break;
            case 3:
                System.out.println("Action");
                break;
            case 4:
                
                break;
            default:
                System.out.println("Unknown error has occured.");
        }
    }
    
    /*private void Genre()
    {
        displayHeader("Make")
        switch(pick)
        {
            case 1:
                System.out.println("Comdey");
                break;
            case 2:
                System.out.println("Drama");
                break;
            case 3:
                System.out.println("Action");
                break;
                
            default:
                System.out.println("Unknown error has occured.");
        }
    }*/

    /*private void Genre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

    
}
