package java24;
//  This example show outer loop is given a name so, the break can stop both 
// loops
public class hour8_ex2{
    public static void main(String[] args) {
        int points = 0;
        int target = 100;
        targetLoop:
        while (target <= 100) {
            for (int i = 0; i < target; i++) {
            if (points > 50)
                break targetLoop;
            points = points + i;
        }
        }
    }
}
    