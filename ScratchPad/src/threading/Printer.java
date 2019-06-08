package threading;

public class Printer implements Runnable {

    @Override
    public void run() {
        System.out.println("I'm printing");
    }
}
