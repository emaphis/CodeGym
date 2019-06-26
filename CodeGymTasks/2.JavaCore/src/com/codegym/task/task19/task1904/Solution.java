package com.codegym.task.task19.task1904;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            String line = fileScanner.nextLine();
            String[] data = line.split(" ");
            String lastName = data[0];
            String firstName = data[1];
            String middleName = data[2];
            String strDate =  data[3] + " " + data[4] + " " + data[5];
            Date date = new SimpleDateFormat("d M y").parse(strDate);
            return new Person(firstName, middleName, lastName, date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
