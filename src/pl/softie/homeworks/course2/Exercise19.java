package pl.softie.homeworks.course2;

import java.util.List;

public class Exercise19 {

    public static void main(String[] args) {
        System.out.println(getTheLongestString(List.of("str", "str2", "the longest")));
        System.out.println(getTheLongestString(List.of("str", "str2", "the longest", "even longer string")));
    }

    public static String getTheLongestString(List<String> strings) {
        String theLongest = "";
        for(String s : strings) {
            theLongest = theLongest.length() > s.length() ? theLongest : s;
        }
        return theLongest;
    }

}
