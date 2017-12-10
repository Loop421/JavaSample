
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author drcho_000
 */
class InputMenu {

    public InputMenu() {
        
                Scanner in = new Scanner(System.in);
        display_menu();
        
        switch (in.nextInt())
        {
            case 1: 
                System.out.println("You picked option 1");
                question();
                break;
        
            case 2: 
                System.out.println("You picked option 2");
                question();
                break;
        
            case 3: 
                System.out.println("You picked option 3");
                question();
                break;
                
            default:
                System.out.println("Unrecongized option");
                break;
                
                
        }

    }
    
    
}
