package dates;

import java.util.Date;

/**
 * Check wether a certain amount of time has passed
 */
public class Example3 {
    public static void main(String[] args) throws InterruptedException {
        Date startTime = new Date();

        // +5 seconds
        long endTime = startTime.getTime() + 5000;
        Date endDate = new Date(endTime);

        // wait 3 seconds
        Thread.sleep(3000);

        Date currentTime = new Date();
        // Check whether currentTins is after endDate
        if (currentTime.after(endDate)) {
            System.out.println("End time!");
        }
    }
}
