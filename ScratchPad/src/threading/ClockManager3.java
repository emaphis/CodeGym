package threading;

public class ClockManager3 {

    public static void main(String[] args) throws InterruptedException {
        Clock3 clock = new Clock3();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clockThread.interrupt();
    }
}
