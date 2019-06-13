package threading;

public class ClockManager1  {

    public static boolean isClockRun = true;

    public static void main(String[] args) throws InterruptedException {
        Clock1 clock = new Clock1();
        Thread clcckThread = new Thread(clock);
        clcckThread.start();

        Thread.sleep(10000);
        isClockRun = false;
    }
}
