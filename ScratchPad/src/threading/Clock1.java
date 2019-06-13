package threading;

public class Clock1 implements Runnable {

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Tick");

            if (!ClockManager1.isClockRun)
                return;;
        }
    }

}
