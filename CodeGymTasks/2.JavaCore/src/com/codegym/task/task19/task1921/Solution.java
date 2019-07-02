package com.codegym.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
John Johnson

*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        BufferedReader fileReader = new BufferedReader(new FileReader(fileName));

        while (fileReader.ready()) {
            String line = fileReader.readLine();
            String[] tokens = line.split(" ");

            // the last 3 tokens are part of the date, the rest are name.
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < tokens.length - 3; i++) {
                builder.append(tokens[i]).append(" ");
            }
            String name = builder.toString().trim();

            int month = Integer.parseInt(tokens[tokens.length - 3]);
            int day = Integer.parseInt(tokens[tokens.length - 2]);
            int year = Integer.parseInt(tokens[tokens.length -1]);

            Date date = new GregorianCalendar(year, month - 1, day).getTime();

            PEOPLE.add(new Person(name, date));
        }
        fileReader.close();

        //for (Person person : PEOPLE) {
        //    System.out.println(person.getName() + person.getBirthDate());
        //}
    }
}
