package java24;
// Example would loop forever because the break statment is only 
// fot the inner loop not the outter loop.
public class hour8_ex1{
    public static void main(String[] args) {
        int points = 0;
        int target = 100;
        while (target <= 100) {
            for (int i = 0; i < target; i++) {
            if (points > 50)
                break;
            points = points + i;
        }
        }
    }
}
    