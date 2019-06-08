package singleton;


/**
 * Eager initialization
 * By making the constructor private we can control how the class can
 * be created.
 */
public class SingletonClass {
    private static volatile SingletonClass instance = new SingletonClass();

    // private constructor.
    private SingletonClass() {}

    public static SingletonClass getInstance() {
        return instance;
    }
}
