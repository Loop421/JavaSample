package java24;

class NewVirusTester {
    public static void main(String[] args){
        NewVirus smash = new NewVirus();
        NewVirus crash = new NewVirus();
        NewVirus Crumble = new NewVirus();
        
        System.out.println("There are " + NewVirus.getVirusCount() + " viruses");
        System.out.println("The smash NewVirus object has a newSecond value of "
            + smash.getNewSecond());
        System.out.println("Attemping to change the value of newSeconds to 20.");
        
        if (smash.setNewSeconds(30) == true){
            System.out.println("Attempt succeeded");
        } else {
            System.out.println("Attempt failed");
        }
        System.out.println("The smash NewVirus object has a newSeconds value of "
        + smash.getNewSecond());
        
        if (smash.setNewSeconds(90) == true){
            System.out.println("Attempt succeeded.");
        } else {
            System.out.println("Attempt failed.");
        }
        System.out.println("The smash NewVirus object has a newSeconds value of "
            + smash.getNewSecond());
    }
}