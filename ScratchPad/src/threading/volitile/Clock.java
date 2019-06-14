package threading.volitile;

public class Clock implements Runnable {
    private volatile boolean isCancel = false;

    public void cancel() {
        isCancel = true;
    }

    @Override
    public void run() {
        while (!isCancel) {
            try {
                Thread.sleep(1000);
                System.out.println("Tick");
            } catch (InterruptedException e) {
                System.out.println(e.toString());
            }
        }
    }

}
