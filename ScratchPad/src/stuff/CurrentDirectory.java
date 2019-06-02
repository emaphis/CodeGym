package stuff;

public class CurrentDirectory {

    public static void main(String[] args) {
        String cwd = System.getProperty("user.dir");
        System.out.println(cwd);
    }
}
