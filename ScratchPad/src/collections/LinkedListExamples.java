package collections;

import java.util.LinkedList;


public class LinkedListExamples {

    static void testList() {
        String str1 = "Hello World!";
        String str2 = "My name is Earl";
        String str3 = "I love Java";
        String str4 = "I live in Canada";

        LinkedList<String> earlBio = new LinkedList<>();
        earlBio.add(str1);
        earlBio.add(str2);
        earlBio.add(str3);
        earlBio.add(str4);

        System.out.println(earlBio);
    }

    public static void main(String[] args) {
        testList();
    }
}
