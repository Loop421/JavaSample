package java24;

class NoteGrade1 {
    public static void main(String[] args) {
        int grade = 75;
        if (grade > 89) {
            System.out.println("You got an A. Great job!");
        } else if (grade > 79) {
            System.out.println("You got a B. Good job!");
        } else if (grade > 69) {
            System.out.println("You got a C. You'll never get into a good college");
        } else {
            System.out.println("You got a F. You'll do well in Congress!");
        }
    }
}