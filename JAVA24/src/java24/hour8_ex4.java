package java24;
// Complex for Loops
class hour8_ex4 {
    public static void main(String[] args){
        int i, j;
        for (i = 0, j = 0; i * j < 1000; i++, j += 2){
            System.out.println(i + " * " + j + " = " + (i * j));
        }
    }
}