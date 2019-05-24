package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CollectionsExamples {

    static ArrayList<String> createList() {
        String mercury = new String("Mercury");
        String venus = new String("Venus");
        String earth = new String("Earth");
        String mars = new String("Mars");
        String jupiter = new String("Jupiter");
        String saturn = new String("Saturn");
        String uranus = new String("Uranus");
        String neptune = new String("Neptune");

        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune));

        return solarSystem;
    }

    static void printList(ArrayList<String> list) {
        for (String item : list) {
            System.out.println(item);
        }
    }

    static void testCollections() {
        ArrayList<String> list = createList();
        Collections.sort(list);
        Collections.reverse(list);
        printList(list);
    }

    static void testMinMax() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7));
        System.out.println(Collections.max(numbers));
        System.out.println(Collections.min(numbers));
    }

    static void testShuffle() {
        ArrayList<Integer> bingoDrum = new ArrayList<>(100);
        for (int i = 0; i < 100; i++) {
            bingoDrum.add(i);
        }

        Collections.shuffle(bingoDrum);

        System.out.println("Your attention, please! Here are the first 10 numbers");
        for (int i = 0; i < 10; i++) {
            System.out.println(bingoDrum.get(i));
        }
    }

    static void testUnmodifiableList() {
        String mercury = "Mercury";
        String venus = "Venus";
        String earth = "Earth";
        String mars = "Mars";
        String jupiter = "Jupiter";
        String saturn = "Saturn";
        String uranus = "Uranus";
        String neptune = "Neptune";

        List<String> solarSystem = Collections.unmodifiableList(new ArrayList<>(Arrays.asList(mercury, venus, earth, mars,
                jupiter, saturn, uranus, neptune)));
        solarSystem.add("Pluto");  // Try to add a new element;
    }

    static void testSwap() {
        String mercury = "Mercury";
        String venus = "Venus";
        String earth = "Earth";
        String mars = "Mars";
        String jupiter = "Jupiter";
        String saturn = "Saturn";
        String uranus = "Uranus";
        String neptune = "Neptune";

        // wrong order
        ArrayList<String> solarSystem = new ArrayList<>(Arrays.asList(neptune, venus, earth, mars,
                jupiter, saturn, uranus, mercury));
        System.out.println(solarSystem);

        Collections.swap(solarSystem, solarSystem.indexOf(mercury), solarSystem.indexOf(neptune));
        System.out.println(solarSystem);
    }

    static void testDisjoint() {
        String mercury = "Mercury";
        String venus = "Venus";
        String earth = "Earth";
        String mars = "Mars";
        String jupiter = "Jupiter";
        String saturn = "Saturn";
        String uranus = "Uranus";
        String neptune = "Neptune";

        ArrayList<String> solarSystemPart1 = new ArrayList<>(Arrays.asList(mercury, venus, earth, mars));
        ArrayList<String> solarSystemPart2 = new ArrayList<>(Arrays.asList(jupiter, saturn, uranus, neptune));

        System.out.println(Collections.disjoint(solarSystemPart1, solarSystemPart2));
    }

    public static void main(String[] args) {
        //testCollections();
        //testMinMax()
        //testShuffle();
        //testUnmodifiableList();
        //testSwap();
        testDisjoint();
    }
}
