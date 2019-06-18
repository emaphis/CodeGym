package streams;

import java.io.*;

public class BufferedExample {

    public static void main(String[] args) throws IOException {
        // Put data into a string
        StringBuffer sb = new StringBuffer();
        sb.append("Lena").append('\n');
        sb.append("Olya").append('\n');
        sb.append("Anya").append('\n');
        String data = sb.toString();

        // Wrap the string in a ByteArrInputStream
        InputStream is = new ByteArrayInputStream(data.getBytes());

        // Replace in
        System.setIn(is);

        // Call and ordinary method that doesn't know about our changes
        readAndPrintLine();
    }

    public static void readAndPrintLine() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(isr);

        while (true) {
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }

        reader.close();
        isr.close();
    }

}
