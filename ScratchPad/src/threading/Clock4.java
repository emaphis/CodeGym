package threading;

public class Clock4 extends Thread {

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("The clock was interrupted");
                break;
            }
            System.out.println("Tick");
        }
    }
}
