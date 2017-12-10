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

public class MovieSelect {
    
    static Scanner scan = new Scanner(System.in);
    static String name;
    static String[] movielist = {"1) The Avengers","2) SAW IV","3) Promethius","4) The Simpsons"};
    static int number;
    
    public static void getName()
    {
        System.out.println("Please input your name");
        name=scan.nextLine();
        System.out.println("Hello " + name);
        getMovie();
    }
    
    public static void getMovie()
    {
        System.out.println("Please select a movie");
        for(int i = 0; i < movielist.length; i++)
        {
            System.out.println(movielist[i]);
        }
        number=scan.nextInt();
        System.out.println("You selected the movie " + movielist[number - 1].substring(3, movielist[number - 1].length()));
        getSeats();
    }
    public static void getSeats()
    {
        System.out.println("Please choose how many seats you would like");
        String seats=scan.next();
        System.out.println("Thank you, \nYou have selected " + seats  +
                " seat(s) for the movie " + movielist[number - 1].substring(3, movielist[number - 1].length()));
    }
    
    public static void main(String[] args)
    {
        getName();
    }
}
