package inheritance;

public class Instanceof2 {

    static void example1() {
        Integer x = new Integer(22);

        System.out.println(x instanceof Integer);
    }

    static void example2() {
        Integer x = new Integer(22);

       // System.out.println(x instanceof String);
    }


    static public class Animal {
    }

    static public class Cat extends Animal {
    }

    static public class MaineCoon extends Cat {
    }

    static void example3() {
        Cat cat = new Cat();
        System.out.println(cat instanceof Animal);
        System.out.println(cat instanceof MaineCoon);
    }

    static void example4() {
        Cat cat = new MaineCoon();
        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof MaineCoon);
    }

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }
}
