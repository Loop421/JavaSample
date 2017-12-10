package CST_3513_Fall_2017;

/*

*/



import java.util.Scanner;

public class monthDays {
    public static void main(String[] args){
        
        Scanner input = new Scanner (System.in);
        
        /*
        Prompt the user to enter a year and the first three letter 
        of a month name
        */
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        
        System.out.print("Enter a month by it first three letters: ");
        String month = input.next();
        
        // To check for leap year
        boolean leapYear = 
                ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
        
        // Display the number of the days in the month
        if ( month.equals("Jan") || month.equals("Mar") ||
                month.equals("May") || month.equals("Jul")
                || month.equals("Aug") || month.equals("Oct") ||
                month.equals("Dec"))
            
            System.out.println(31 + " days");
        
        else if (month.equals("Apr") || month.equals("Jun") ||
                month.equals("Sep") || month.equals("Nov"))
            System.out.println(30 + " days");
        
        else
            System.out.println((leapYear) ? 29 : 28 + "days");
        
    }
}