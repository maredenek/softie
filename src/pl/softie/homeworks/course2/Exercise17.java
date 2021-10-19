package pl.softie.homeworks.course2;

import java.util.ArrayList;
import java.util.List;

public class Exercise17 {

    public static void main(String[] args) {
        System.out.println(doubleAllElements(List.of("1", "2", "3")));
    }

    public static List<String> doubleAllElements(List<String> source) {
        List<String> output = new ArrayList<>();
        for(String s : source) {
            output.add(s);
            output.add(s);
        }
        return output;
    }

}
