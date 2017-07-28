package java24;

public class BallCarrier extends FootballPlayer {
    public void run(){
        System.out.println("#" + this.number +
                " run with the ball.");
    }
    
    public void catchBall() {
        System.out.println("#" + this.number +
                " catches the ball.");
    }
}