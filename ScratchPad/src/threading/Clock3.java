package threading;

public class Clock3 implements Runnable {

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        while (!current.isInterrupted()) {
            //System.out.print(current.isInterrupted() + ": ");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
             //   System.out.println(e.toString());
                return;
            }
            System.out.println("Tick");
        }
    }
}
