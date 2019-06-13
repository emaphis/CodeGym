package threading;

public class ClockManager2 {

    public static void main(String[] args) throws InterruptedException {
        Clock2 clock = new Clock2();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        clock.cancel();
    }

}
