package threading;

public class Clock2 implements Runnable {
    private boolean isCancel = false;

    public void cancel() {
        this.isCancel = true;
    }

    @Override
    public void run() {
        while (!isCancel) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("Tick");
        }
    }
}
