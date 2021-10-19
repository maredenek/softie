package pl.softie.homeworks.course2.exercise16;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {
        Cat cat1 = new Cat("red", "cat1", true, true);
        Cat cat2 = new Cat("cat2", "red", true, true);
        Cat cat3 = new Cat("cat3", "red", true, true);
        Cat cat4 = new Cat("cat4", "red", true, true);
        Cat cat5 = new Cat("cat5", "red", true, true);

        HashMap<Cat, String> map = new HashMap<>();
        map.put(cat1, cat1.getName());
        map.put(cat2, cat2.getName());
        map.put(cat3, cat3.getName());
        map.put(cat4, cat4.getName());
        map.put(cat5, cat5.getName());

    }

}
