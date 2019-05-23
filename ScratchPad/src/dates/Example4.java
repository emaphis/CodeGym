package dates;

import java.util.Date;

/**
 * Determine how much time has passed since the beginning of the day:
 */
public class Example4 {
    public static void main(String[] args) {
        Date currentTime = new Date();
        int hours = currentTime.getHours();
        int mins = currentTime.getMinutes();
        int secs = currentTime.getSeconds();

        System.out.println("Time since midnight: " + + hours + ":" + mins + ":" + secs);
    }
}
