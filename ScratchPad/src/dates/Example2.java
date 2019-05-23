package dates;

import java.util.Date;

/**
 * Calculate the difference between the two dates.
 */
public class Example2 {
    public static void main(String[] args) throws InterruptedException {
        Date currentTime = new Date();
        Thread.sleep(3000);
        Date newTime = new Date();

        long msDalay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time difference is: " + msDalay);
    }
}
