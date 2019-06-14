package threading.volitile;

public class Main {

    static void testVolitile() {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        clock.cancel();
    }

    public static void main(String[] args) {
        testVolitile();
    }
}
