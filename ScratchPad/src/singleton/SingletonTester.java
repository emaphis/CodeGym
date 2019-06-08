package singleton;

// Homepage:
// https://medium.com/@kevalpatel2106/digesting-singleton-design-pattern-in-java-5d434f4f322
// https://www.geeksforgeeks.org/java-singleton-design-pattern-practices-examples/


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTester {

    static void testSingleton1() {
        // Instance 1
        SingletonEager instance1 = SingletonEager.getInstance();

        // Instance 2
        SingletonEager instance2 = SingletonEager.getInstance();

        // now lets check the hash key
        System.out.println("Instance 1 hash: " + instance1.hashCode());
        System.out.println("Instance 2 hash: " + instance2.hashCode());
    }

    static void testReflection() {
        // Instance 1
        SingletonEager instance1 = SingletonEager.getInstance();

        // Instance 2 using Java Reflection.
        SingletonEager instance2 = null;
        try {
            Class<SingletonEager> clazz = SingletonEager.class;
            Constructor<SingletonEager> cons = clazz.getDeclaredConstructor();
            cons.setAccessible(true);
            instance2 = cons.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException |
                IllegalAccessException | InstantiationException e) {
            System.out.println(e.toString());
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }

        // now lets check the hash key
        System.out.println("Instance 1 hash: " + instance1.hashCode());
        System.out.println("Instance 2 hash: " + instance2.hashCode());
    }


    public static void main(String[] args) {
        testSingleton1();
        testReflection();
    }
}
