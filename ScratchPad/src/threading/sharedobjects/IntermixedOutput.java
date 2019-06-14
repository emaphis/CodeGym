package threading.sharedobjects;

public class IntermixedOutput {

    static class Output1 extends Thread {
        @Override
        public void run() {
            System.out.print("Nick is");
            System.out.print(" ");
            System.out.print("15");
            System.out.print(" ");
            System.out.print("years old");
            System.out.println();
        }
    }

    static class Output2 extends Thread {
        @Override
        public void run() {
            System.out.print("Lena is");
            System.out.print(" ");
            System.out.print("21");
            System.out.print(" ");
            System.out.print("years old");
            System.out.println();
        }
    }

    static void textExample1() {
        Thread nick = new Output1();
        Thread lena = new Output2();

        nick.run();
        lena.run();

        nick.start();
        lena.start();
    }

    static class MyClass implements Runnable  {
        private String name1 = "Ally";
        private String name2 = "Lena";

        public void swap() {
            String s = name1;
            name1 = name2;
            name2 = s;
        }

        @Override
        public void run() {
            swap();
            System.out.println("n1: " + name1);
            System.out.println("n2: " + name2);
        }
    }

    static void testExample2() {
        MyClass swapper = new MyClass();
        Thread thread1 = new Thread(swapper);
        Thread thread2 = new Thread(swapper);

        thread1.start();
        thread2.start();
    }


    static class MyClass2 implements Runnable  {
        private String name1 = "Ally";
        private String name2 = "Lena";

        public void swap() {
            synchronized (this) {
                String s = name1;
                name1 = name2;
                name2 = s;
            }
        }

        @Override
        public void run() {
            swap();
            System.out.println("n1: " + name1);
            System.out.println("n2: " + name2);
        }
    }


    static void testExample3() {
        MyClass2 swapper = new MyClass2();
        Thread thread1 = new Thread(swapper);
        Thread thread2 = new Thread(swapper);

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) {
        //textExample1();
        //testExample2();
        testExample3();
    }

}
