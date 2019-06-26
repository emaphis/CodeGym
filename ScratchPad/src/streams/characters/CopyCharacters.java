package streams.characters;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Character oriented i/o.
 */
public class CopyCharacters {

    public static void main(String[] args) throws IOException {
        FileReader inputStream = null;
        FileWriter outputStream = null;

        try {
            inputStream = new FileReader("data.txt");
            outputStream = new FileWriter("result.txt");

            int c;
            while ((c = inputStream.read()) != -1) {
                outputStream.write(c);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
