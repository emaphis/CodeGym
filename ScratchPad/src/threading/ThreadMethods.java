package threading;

public class ThreadMethods {

    /**
     *  Thread.start();
     */
    static void testMyFirstThread() {
        for (int i = 0; i < 10; i++) {
            MyFirstThread thread = new MyFirstThread();
            thread.start();
        }
    }

    /**
     *  Thread.sleep();
     */
    static void testSleep() {
        long start = System.currentTimeMillis();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
        long stop = System.currentTimeMillis();
        long durration = stop - start;
        System.out.println(durration);
    }

    /**
     * Thread.join();
     */
    static void testJoin() {
        JoinExample t1 = new JoinExample();
        JoinExample t2 = new JoinExample();

        t1.start();
        /* The second thread (t2) will start running only after the first thread(t1)
          is finished (or an exception is thrown)  */
        try {
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

        t2.start();

        // The main thread will continue running only after t1 and t2 have finished
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }

        System.out.println("All threads have finished. The program is finished.");
    }

    /**
     *  Thread.interrupt();
     */
    static void testInterupt() {
        Clock4 clock = new Clock4();
        clock.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            System.out.println(e.toString());
        }
        clock.interrupt();
    }

    public static void main(String[] args) {
        System.out.println("Treading");
       // testMyFirstThread();
        //testSleep();
        //testJoin();
        testInterupt();
    }

}
