package threading;

public class JoinExample extends Thread {

    @Override
    public void run() {
        System.out.println("Thread started: " + getName());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
        System.out.println("Thread " + getName() + " is finished");
    }
}
