package java24;

class NoteGrade2 {
    public static void main(String[] args) {
        int grade = 100;
        char letterGrade;
        if (grade > 89) {
            letterGrade = 'A';
        } else if (grade > 79) {
            letterGrade = 'B';
        } else if (grade > 69) {
            letterGrade = 'C';
        } else {
            letterGrade = 'F';
        }
        switch (letterGrade){
            case 'A':
                System.out.println("You got an A. Great job!");
                break;
            case 'B':
                System.out.println("You got a B. Good job!");
                break;
            case 'C':
                System.out.println("You got a C. You'll never get into a good college");
                break;
            default:
                System.out.println("You got a F. You'll do well in Congress!");
        }
    }
}