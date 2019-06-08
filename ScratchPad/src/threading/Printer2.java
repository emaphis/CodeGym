package threading;

public class Printer2 implements Runnable {
    private String name;

    public Printer2(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Printing name : " + name);
    }
}
