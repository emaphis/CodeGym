package com.codegym.task.task18.task1814;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
UnsupportedFileName

*/

public class TxtInputStream extends FileInputStream {
    private FileOutputStream outputStream;

    /**
     *  Constructor for TxtInputStream.
     * @param fileName Filename of file to operate on.
     * @throws IOException thrown for bad file operations.
     * @throws UnsupportedFileNameException only supports txt files.
     */
    public TxtInputStream(String fileName) throws IOException, UnsupportedFileNameException {
        super(fileName);
        if (!fileName.endsWith(".txt")) {
            super.close();
            throw new UnsupportedFileNameException();
        }
    }

    public static void main(String[] args) {
    }
}

