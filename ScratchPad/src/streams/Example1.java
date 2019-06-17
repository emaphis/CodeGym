package streams;

import java.io.*;

public class Example1 {


     static void levelsOfStreams() {
        // Levels of streams.

        // Output a string to the console
        System.out.println("Hello1");

        // Store the console output stream in a separate vairalbe.
        // Output a string to the stream.
        PrintStream console = System.out;
        console.println("Hello2");

        // Create a dynamic (expanding) bye array in memory.
        // Connect it to a new output stream (PrintStream object).
        // Out put a string to the stream.
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        PrintStream console2 = new PrintStream(stream);
        console2.println("Hello3");
    }

    /**
     * Sum up all the bytes in a file
     */
    static void testFileInputStream() {
         // Create a FileInputStream object boutd to "data.txt".
        try {
            FileInputStream inputStream = new FileInputStream("data.txt");
            long sum = 0;

            while (inputStream.available() > 0) { // as long as their is unread bytes
                int data = inputStream.read();  // Read the next byte.
                sum += data;  // add it to the running total.
            }
            inputStream.close();
            System.out.println(sum);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }


    static void testOutputFileStream() {
        try {
            // Create a stream to read bytes from a file
            FileInputStream inputStream = new FileInputStream("data.txt");
            // Craate a stream to write bytes to a file
            FileOutputStream outputStream = new FileOutputStream("result.txt");

            while (inputStream.available() > 0) {
                int data = inputStream.read();
                outputStream.write(data);
            }
            inputStream.close();
            outputStream.close();
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
    }

    public static void main(String[] args) {
        //levelsOfStreams();
        //testFileInputStream();
        testOutputFileStream();
    }
}
