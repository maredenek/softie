package pl.softie.homeworks.course2;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise18 {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("key1", "val1");
        map.put("key2", "val2");
        map.put("key3", "val3");
        map.put("key4", "val4");
        map.put("key5", "val5");

        Map<String, String> notModified = Map.of(
                "key1", "val1",
                "key2", "val2",
                "key3", "val3",
                "key4", "val4",
                "key5", "val5"
        );

        displayKeys(map);
        displayKeys(notModified);
    }

    public static void displayKeys(Map<String, String> map) {
        System.out.println(map.keySet());
    }

}
