package threading.volitile;

public class YieldExample {

    static class ThreadExample extends Thread {

        public ThreadExample() {
            this.start();
        }

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " yields its place to others");
            Thread.yield();
            System.out.println(Thread.currentThread().getName() + " has finished executing.");
        }
    }

    public static void main(String[] args) {
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
        new ThreadExample();
    }
}
