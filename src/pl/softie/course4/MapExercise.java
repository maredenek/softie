package pl.softie.course4;

import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("develop", "www.develop.my.app.com");
        map.put("int", "www.int.my.app.com");
        map.put("stg", "www.stg.my.app.com");
        map.put("pr", "www.my.app.com");

        // iterating over keys
        System.out.println("Iterating over keys");
        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // iterating over values
        System.out.println("Iterating over values");
        for (String val : map.values()) {
            System.out.println(val);
        }

        // iterating over collection Java8
        System.out.println("Iterating over collection Java8");
        map.forEach( (k,v) -> System.out.println(k + " : " + v));
    }

}
