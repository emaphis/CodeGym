package inheritance;

class Pet {
    public void doPetActions() { }
}

class Cat extends Pet {
    public void doCatActions() { }
}

class Tiger extends Cat {
    public void doTigerActions() { }
}


public class InstanseOf {

    static void example1() {
        Tiger tiger = new Tiger();
        Cat cat = new Tiger();
        Pet pet = new Tiger();
        Object obj = new Tiger();
    }

    static void example2() {
        Object obj = new Tiger();
        Pet pet = (Pet) obj;
        Cat cat = (Cat) obj;
        Tiger tiger = (Tiger) pet;
        Tiger tiger2 = (Tiger) cat;
    }

    // use instance of
    static void example3() {
        Object obj = new Tiger();
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            cat.doCatActions();
        }
    }

    static void example4() {
        Pet pet = new Tiger();
        doAllAction(pet);

        Pet pet2 = new Cat();
        doAllAction(pet);

        Pet pet3 = new Pet();
        doAllAction(pet3);
    }

    static void doAllAction(Pet pet) {
        if (pet instanceof Tiger) {
            Tiger tiger = (Tiger) pet;
            tiger.doTigerActions();
        }
        if (pet instanceof Cat) {
            Cat cat = (Cat) pet;
            cat.doCatActions();
        }

        pet.doPetActions();
    }

    public static void main(String[] args) {
        example1();
        example2();
        example3();
        example4();
    }
}
