package singleton;

public class GFG {
    private static GFG instance;

    private GFG() { }

    public static GFG getInstance() {
        if (instance == null) {
            instance = new GFG();
        }
        return instance;
    }
}
