package threading;

import java.util.TreeMap;

public class TestThread {

    static void testPrinter1() {
        Printer printer = new Printer();
        Thread thread = new Thread(printer);
        thread.run();
    }

    static void testPrinter2() {
        Printer2 printer1 = new Printer2("Nick");
        Thread thread1 = new Thread(printer1);
        thread1.start();

        Printer2 printer2 = new Printer2("Jack");
        Thread thread2 = new Thread(printer2);
        thread2.start();
    }

    static void testPrinter3() {
        Printer2 printer = new Printer2("Sue");

        Thread thread1 = new Thread(printer);
        Thread thread2 = new Thread(printer);
        Thread thread3 = new Thread(printer);

        thread1.run();
        thread2.run();
        thread3.run();
    }

    public static void main(String[] args) {
        //testPrinter1();
        //testPrinter2();
        testPrinter3();
    }
}
