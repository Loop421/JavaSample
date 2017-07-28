package java24;

class Benchmark2 {
    public static void main(String[] args){
        // startTime is created with the current time in milliseconds as
        // it value
        long startTime = System.currentTimeMillis();
        /*
        endTime is created with a value 60,000 higher the startTime.
        Because one mintue equals 60,000 milliseconds, this sets the 
        variable to one mintue past startTime.
        */
        long endTime = startTime + 60000;
        long index = 0;
        while (true) {
            double x = 17 / 76;
            long now = System.currentTimeMillis();
            /*
            If now is greater than endTime, this signifiles that the loop
            has been running for one minute and break ends the while loop.
            Otherwise, it keep looping.
            */
            if (now > endTime){
                break;
            }
            index++;
        }
        System.out.println(index + " loops in one minute.");
    }
}