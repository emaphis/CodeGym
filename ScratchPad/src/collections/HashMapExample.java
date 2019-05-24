package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapExample {

    static void testHashMap() {
        HashMap<Integer, String> passports = new HashMap<>();

        passports.put(212133, "Bridget Logan");
        passports.put(162348, "Ivan the Great");
        passports.put(8082771, "Donald John Trump");
        // duplicated key
        passports.put(162348, "Albert Kent");
        System.out.println(passports);
    }


    static void testRemove() {
        HashMap<Integer, String> passports = new HashMap<>();

        passports.put(212133, "Bridget Logan");
        passports.put(162348, "Ivan the Great");
        passports.put(8082771, "Donald John Trump");

        String lidiaName = passports.get(212133);
        System.out.println(lidiaName);

        passports.remove(162348);
        System.out.println(passports);
    }


    static void testContains() {
        HashMap<Integer, String> passports = new HashMap<>();

        passports.put(212133, "Bridget Logan");
        passports.put(162348, "Ivan the Great");
        passports.put(8082771, "Donald John Trump");

        System.out.println(passports.containsKey(111111));
        System.out.println(passports.containsKey(8082771));
        System.out.println(passports.containsValue("Donald John Trump"));
    }

    static void testReturnLists() {
        HashMap<Integer, String> passports = new HashMap<>();

        passports.put(212133, "Bridget Logan");
        passports.put(162348, "Ivan the Great");
        passports.put(8082771, "Donald John Trump");

        Set keys = passports.keySet();
        System.out.println(keys);

        ArrayList<String> values = new ArrayList<>(passports.values());
        System.out.println(values);
    }


    static void testSizeClear() {
        HashMap<Integer, String> passports = new HashMap<>();

        passports.put(212133, "Bridget Logan");
        passports.put(162348, "Ivan the Great");
        passports.put(8082771, "Donald John Trump");

        System.out.println(passports.size());

        passports.clear();
        System.out.println(passports);
    }



    public static void main(String[] args) {
        //testHashMap();
        //testRemove();
        //testContains();
        //testReturnLists();
        testSizeClear();
    }
}
