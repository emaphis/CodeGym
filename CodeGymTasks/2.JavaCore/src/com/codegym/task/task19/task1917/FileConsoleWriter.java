package com.codegym.task.task19.task1917;

/* 
Your own FileWriter

*/

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileWriter;
import java.io.IOException;

public class FileConsoleWriter {
    private FileWriter fileWriter;

    public FileConsoleWriter(String fileName) throws IOException {
        this.fileWriter = new FileWriter(fileName);
    }

    public FileConsoleWriter(String fileName, boolean append) throws IOException {
        this.fileWriter = new FileWriter(fileName, append);
    }

    public FileConsoleWriter(File file) throws IOException {
        this.fileWriter = new FileWriter(file);
    }

    public FileConsoleWriter(File file, boolean append) throws IOException {
        this.fileWriter = new FileWriter(file, append);
    }

    public FileConsoleWriter(FileDescriptor fd) {
        this.fileWriter = new FileWriter(fd);
    }

    public String getEncoding() {
        return fileWriter.getEncoding();
    }

    public void write(char[] cbuf, int off, int len) throws IOException {
        System.out.print(new String(cbuf, off, len));
        fileWriter.write(cbuf, off, len);
    }

    public void write(int c) throws IOException {
        System.out.print(c);
        fileWriter.write(c);
    }

    public void write(String str) throws IOException {
        System.out.print(str);
        fileWriter.write(str);
    }

    public void write(String str, int off, int len) throws IOException {
        System.out.print(str.substring(off, off + len));
        fileWriter.write(str, off, len);
    }

    public void write(char[] cbuf) throws IOException {
        System.out.print(cbuf);
        fileWriter.write(cbuf);
    }

    public void flush() throws IOException {
        fileWriter.flush();
    }

    public void close() throws IOException {
        fileWriter.close();
    }


    public static void main(String[] args) {

    }

}
