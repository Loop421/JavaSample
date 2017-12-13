/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drcho_000
 */
import java.util.Scanner;
import java.io.*;

public class MovieRental {
    //these are golbal varible allowing more than one method to use 
    static Scanner scan = new Scanner(System.in);
    static int select; 
    static boolean exit;
    static String firstMovie;
    static String secondMovie;
    static String thridMovie;
    
    public static void getSelect() throws IOException
    {
        System.out.println();
        printHeader(); // This would print out the nice header in printHeader method.
        System.out.println("Please select an option");
        System.out.println("1) Rent a movie");
        System.out.println("2) Movie return");
        System.out.println("0) Exit");
        
        System.out.print("Enter your choice: ");
        select = scan.nextInt();
        
        switch(select)
        {
            case 0:
                System.out.println("Thank you for using our application.");
                System.exit(0);
                break;
                
            case 1:
                getGener();
                break;
                
            case 2:
                getReturn();
                break;
                
            default:
                System.out.println("Unknown error has occured.");
        }
    }
    
    public static void getGener() throws IOException
    {
        System.out.println();
        System.out.println("Please select a gener");
        System.out.println("1) Comedy");
        System.out.println("2) Action");
        System.out.println("3) Drama");
        System.out.println("0) Exit"); //this may be remove as what we are aiming for wont need this.
        System.out.print("Enter your choice: ");
        select = scan.nextInt();
        
        switch(select)
        {
            case 0:
                System.out.println("Thank you for using our application.");
                System.exit(0);
                break;
                
            case 1:
                getComedyMovie();
                break;
                
            case 2:
                getActionMovie();
                break;
            case 3:
                getDramaMovie();
                break;
            
            default:
                System.out.println("Unknown error has occured.");
        }
    }
    
    public static void getComedyMovie() throws IOException
    {
        File file = new File("ComedyMoive.txt");
        Scanner input = new Scanner(file);
        
        //check if the file exists
        try 
        {
          while (input.hasNext())
        {
            firstMovie = input.next();
            secondMovie = input.next();
            thridMovie = input.next();
            
            System.out.println();
            System.out.println(firstMovie);
            System.out.println(secondMovie);
            System.out.println(thridMovie);
            System.out.println("0) to go back");
        }  
        } catch (Exception ex)
        {
            //do nothing
        }
        
        System.out.print("Select a movie: ");
        select=scan.nextInt();
        
        switch(select)
        {
            case 0:
                getGener();
                break;
            case 1:
                System.out.println("The movie you have select " + firstMovie);
                getCharge();
                break;
            
            case 2:
                System.out.println("The movie you have select " + secondMovie);
                getCharge();
                break;
            
            case 3:
                System.out.println("The movie you have select " + thridMovie);
                getCharge();
                break;
                
            default:
                System.out.println("Unknown error has occured.");
        }
        
        
        
    }
    public static void getActionMovie() throws IOException
    {
        File file = new File("ActionMovie.txt");
        Scanner input = new Scanner(file);
        
        try 
        {
          while (input.hasNext())
        {
            firstMovie = input.next();
            secondMovie = input.next();
            thridMovie = input.next();
            
            System.out.println();
            System.out.println(firstMovie);
            System.out.println(secondMovie);
            System.out.println(thridMovie);
            System.out.println("0) to go back");
        }  
        } catch (Exception ex)
        {
            //do nothing
        }
        
        System.out.print("Select a movie: ");
        select=scan.nextInt();
        
        switch(select)
        {
            case 0:
                // This would bring the user back to selecting a gener. 
                // if they like what they saw on the list of moive or pick
                // selected by mistake.
                getGener();
                break;
            case 1:
                System.out.println("The movie you have select " + firstMovie);
                getCharge();
                break;
            
            case 2:
                System.out.println("The movie you have select " + secondMovie);
                getCharge();
                break;
            
            case 3:
                System.out.println("The movie you have select " + thridMovie);
                getCharge();
                break;
            
            default:
                System.out.println("Unknown error has occured.");
        }
    }
    public static void getDramaMovie() throws IOException
    {
        File file = new File("DramaMovie.txt");
        Scanner input = new Scanner(file);
        
        try 
        {
          while (input.hasNext())
        {
            firstMovie = input.next();
            secondMovie = input.next();
            thridMovie = input.next();
            
            System.out.println();
            System.out.println(firstMovie);
            System.out.println(secondMovie);
            System.out.println(thridMovie);
            System.out.println("0) to go back");
        }  
        } catch (Exception ex)
        {
            //do nothing
        }
        
        System.out.print("Select a movie: ");
        select=scan.nextInt();
        
        switch(select)
        {
            case 0:
                getGener();
                break;
            case 1:
                System.out.println("The movie you have select " + firstMovie);
                getCharge();
                break;
            
            case 2:
                System.out.println("The movie you have select " + secondMovie);
                getCharge();
                break;
            
            case 3:
                System.out.println("The movie you have select " + thridMovie);
                getCharge();
                break;
            
            default:
                System.out.println("Unknown error has occured.");
        }
    }
    
    public static void getReturn()
    {
        System.out.println("Thank you for returning the movie");
    }
    
    public static void getCharge()
    {
        System.out.println("Hey good looking");
    }
    
    private static void printHeader() {
        System.out.println("+-----------------------------+");
        System.out.println("|    Welcome to steamBuger    |");
        System.out.println("|        Movie Rental         |");
        System.out.println("+-----------------------------+");
    }
    
    public static void main(String[] args) throws IOException
    {
        // The program should start at the first and move to next method depending 
        // on the user choices or exiting the program.
        // the program would keep running until exit is selected.
        while(!exit)
        {
            getSelect();
        }
        
    }
    
}
