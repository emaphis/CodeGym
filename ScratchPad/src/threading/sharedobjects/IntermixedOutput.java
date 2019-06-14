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

        public String getName1() {
            return name1;
        }

        public String getName2() {
            return name2;
        }

        @Override
        public void run() {
            swap();
            System.out.println(getName1());
            System.out.println(getName2());
        }
    }

    static void testExample2() {
        Thread thread1 = new Thread(new MyClass());
        Thread thread2 = new Thread(new MyClass());
        Thread thread3 = new Thread(new MyClass());

        thread1.start();
        thread2.start();
        thread3.start();
    }


    public static void main(String[] args) {
        //textExample1();
        testExample2();
    }

}
