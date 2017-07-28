package java24;

public class NewVirus{
    static int virusCount = 0;
    private int newSecond = 0;
    
    public NewVirus() {
        virusCount++;
    }
    
    static int getVirusCount(){
        return virusCount;
    }
    
    int getNewSecond(){
        return newSecond;
    }
    
    boolean setNewSeconds(int newValue){
        if ((newValue > 59) & (newValue < 101)){
            newSecond = newValue;
            return true;
        } else {
            return false;
        }
    }
}