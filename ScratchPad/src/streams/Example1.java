package streams;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Example1 {


    public static void main(String[] args) {
        // Levels of streams.

        // Output a string to the console
        System.out.println("Hello");

        // Store the console output stream in a separate vairalbe.
        // Output a string to the stream.
        PrintStream console = System.out;
        console.println("Hello");

        // Create a dynamic (expanding) bye array in memory.
        // Connect it to a new output stream (PrintStream object).
        // Out put a string to the stream.
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console2 = new PrintStream(stream);
        console2.println("Hello");

    }
}
