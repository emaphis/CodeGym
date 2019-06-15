package com.codegym.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2

*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<>();
    private static DateFormat format = new SimpleDateFormat("MM dd yyyy", Locale.ENGLISH);
    private static DateFormat formatOut = new SimpleDateFormat("MMM dd yyyy", Locale.ENGLISH);


    static {
        allPeople.add(Person.createMale("Donald Chump", new Date()));  // id=0
        allPeople.add(Person.createMale("Larry Gates", new Date()));  // id=1
    }

    public static void main(String[] args) {
        // Start here

        switch (args[0]) {
            // Create Person -c
            case "-c":
                for (int i = 1; i < args.length; i += 3) {  // chunks of 3

                    String name = args[i];

                    Date date;
                    try {
                        date = format.parse(args[i + 2]);
                    } catch (ParseException ex) {
                        System.out.println(ex.toString());
                        return;
                    }

                    Person person;
                    if (args[i + 1].equals("m")) {
                        person = Person.createMale(name, date);
                    } else if (args[i+1].equals("f")) {
                        person = Person.createFemale(name, date);
                    } else {
                        System.out.println("invalid sex");
                        return;
                    }

                    synchronized (allPeople) {
                        allPeople.add(person);
                    }

                    System.out.println(allPeople.indexOf(person));

                }
                break;

            // Update Person -u
            case "-u":
                for (int i = 1; i < args.length; i += 4) {  // chunk of 4
                    int idx = Integer.parseInt(args[i]);

                    synchronized (allPeople) {
                        Person person = allPeople.get(idx);

                        person.setName(args[i + 1]);

                        Date date;
                        try {
                            date = format.parse(args[i + 3]);
                        } catch (ParseException ex) {
                            System.out.println(ex.toString());
                            return;
                        }
                        person.setBirthDate(date);

                        if (args[i + 2].equals("m")) {
                            person.setSex(Sex.MALE);
                        } else if (args[i + 2].equals("f")) {
                            person.setSex(Sex.FEMALE);
                        } else {
                            System.out.println("invalid sex");
                            return;
                        }
                    }
                }
                break;

            // Delete Person  -d
            case "-d":
                for (int i = 1; i < args.length; i++) {
                    int idx = Integer.parseInt(args[i]);
                    Person person;
                    synchronized (allPeople) {
                        person = allPeople.get(idx);
                    }
                    person.setName(null);
                    person.setSex(null);
                    person.setBirthDate(null);
                }
                break;

            // Inspect Person  -i
            case "-i":
                //System.out.println("inspect");
                for (int i = 1; i < args.length; i++) {
                    int idx = Integer.parseInt(args[i]);
                    Person person;

                    synchronized (allPeople) {
                        person = allPeople.get(idx);
                    }

                    String name = person.getName();

                    String sex;
                    if (person.getSex() == Sex.MALE) {
                        sex = "m";
                    } else {
                        sex = "f";
                    }

                    String date = formatOut.format(person.getBirthDate());

                    System.out.println(name + " " + sex + " " + date);
                }
                break;
        }

        //for (Person person : allPeople) {
        //    System.out.println(person.getName() + " : " + person.getSex() + " : " + person.getBirthDate());
        //}

    }
}
