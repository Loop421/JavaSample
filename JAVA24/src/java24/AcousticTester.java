package java24;

class AcousticTester{
    public static void main(String[] args){
        AcousticModem hayes = new AcousticModem();
        System.out.println("Trying the acoustic modem:");
        hayes.speed = 300;
        hayes.displaySpeed();
        hayes.connect();
    }
}