package streams.scanning;

import java.io.*;
import  java.util.Scanner;

public class ScanXan {

    public static void main(String[] args) throws IOException {
        Scanner s = null;

        try {
            s = new Scanner(new BufferedReader(new FileReader("data.txt")));

            while (s.hasNext()) {
                s.useDelimiter(",\\s*");
                System.out.println(s.next());
            }
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }

}
