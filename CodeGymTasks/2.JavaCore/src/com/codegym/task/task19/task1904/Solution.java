package com.codegym.task.task19.task1904;

import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Yet another adapter

*/

public class Solution {

    public static void main(String[] args) {
        List<Person> list = new ArrayList<>();
        try {
            Scanner scanner = new Scanner(new FileReader("persons.txt"));
            PersonScanner personScanner = new PersonScannerAdapter(scanner);
            Person person1 = personScanner.read();
            Person person2 = personScanner.read();
            personScanner.close();
            System.out.println(person1);
            System.out.println(person2);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }

    public static class PersonScannerAdapter implements PersonScanner {
        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            Person person = null;
            String line = fileScanner.nextLine();
            String[] data = line.split(" ");

            String firstName = data[0];
            String middleName = data[1];
            String lastName = data[2];
            int month = Integer.parseInt(data[3]) - 1;
            int day = Integer.parseInt(data[4]);
            int year = Integer.parseInt(data[5]);

            Date date = new GregorianCalendar(year, month, day).getTime();

            person = new Person(lastName, firstName, middleName, date);

            return person;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
