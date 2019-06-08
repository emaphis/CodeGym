package singleton;

/**
 * Create class in the getInstance method.
 */
public class SingletonEager {
    private static SingletonEager instance;

    private SingletonEager() {
        // Prevent construction from the reflection api.
        if (instance != null) {
            throw new RuntimeException("Use getInstance()method to get the single instance of this class");
        }
    }

    public static SingletonEager getInstance() {
        if (instance == null) { //if there is no instance available... create new one
            instance = new SingletonEager();
        }

        return instance;
    }
}
