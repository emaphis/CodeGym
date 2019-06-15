package com.codegym.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD

*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<>();
    private static DateFormat format = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    private static DateFormat formatOut = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);

    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // Start here
        if (args.length < 2) return;

        // Create Person -c
        if (args[0].equals("-c")) {
            Person person;
            String name = args[1];

            Date date;
            try {
                date = format.parse(args[3]);
            } catch (ParseException ex) {
                System.out.println(ex.toString());
                return;
            }

            if (args[2].equals("m")) {
                person = Person.createMale(name, date);
            } else if (args[2].equals("f")) {
                person = Person.createFemale(name, date);
            } else  {
                System.out.println("invalid sex");
                return;
            }

            allPeople.add(person);
            System.out.println(allPeople.indexOf(person));
        }
        // Update Person -u
        else if (args[0].equals("-u")) {
            int idx = Integer.parseInt(args[1]);
            Person person = allPeople.get(idx);

            person.setName(args[2]);

            Date date;
            try {
                date = format.parse(args[4]);
            } catch (ParseException ex) {
                System.out.println(ex.toString());
                return;
            }
            person.setBirthDate(date);

            if (args[3].equals("m")) {
                person.setSex(Sex.MALE);
            } else if (args[3].equals("f")) {
                person.setSex(Sex.FEMALE);
            } else  {
                System.out.println("invalid sex");
                return;
            }
        }

        // Delete Person  -d
        else if (args[0].equals("-d")) {
            int idx = Integer.parseInt(args[1]);
            Person person = allPeople.get(idx);
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
        }

        // Inspect Person  -i
        else if (args[0].equals("-i")) {
            int idx = Integer.parseInt(args[1]);
            Person person = allPeople.get(idx);

            String name = person.getName();

            String sex;
            if (person.getSex() == Sex.MALE) {
                sex = "m";
            } else  {
                sex = "f";
            }

            String date = formatOut.format(person.getBirthDate());

            System.out.println(name + " " + sex + " " + date);
        }

        //for (Person person : allPeople) {
        //    System.out.println(person.getName() + " : " + person.getSex() + " : " + person.getBirthDate());
        //}
    }
}
