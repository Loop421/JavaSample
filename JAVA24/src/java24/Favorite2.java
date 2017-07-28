package java24;

class Favorite2{
    public static void main(String[] args) {
        // set up film information
        String favorite = "piano";
        String guess = "piano";
        System.out.println("Is Ada's favortie instrument a "
            + guess + "?");
        System.out.println("Answer: " + favorite.equals(guess));
    }
}