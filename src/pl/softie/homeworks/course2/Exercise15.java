package pl.softie.homeworks.course2;

import java.util.ArrayList;
import java.util.List;

public class Exercise15 {

    public static void main(String[] args) {
        List<String> givenList = new ArrayList<>();
        givenList.add("1");
        givenList.add("2");
        givenList.add("3");
        givenList.add("4");
        givenList.add("5");
        System.out.println(repeatLastElementGivenTimes(givenList, 4));
    }

    public static List<String> repeatLastElementGivenTimes(List<String> source, int repetitionNumber) {
        for(int i=0; i<repetitionNumber; i++) {
            source.add(0, source.get(source.size()-1));
        }
        return source;
    }

}
