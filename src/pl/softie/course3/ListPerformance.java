package pl.softie.course3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListPerformance {

    public static void main(String[] args) {
        List<Integer> arrayL = new ArrayList<>();
        List<Integer> linkedL = new LinkedList<>();
        System.out.println("Adding to the beginning of the list");
        addNumbersAtTheBeginningOfTheList(arrayL);
        addNumbersAtTheBeginningOfTheList(linkedL);
        System.out.println("Adding to the end of the list");
        addNumbersToTheEndOfTheList(arrayL);
        addNumbersToTheEndOfTheList(linkedL);
    }

    static void addNumbersAtTheBeginningOfTheList(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }

    static void addNumbersToTheEndOfTheList(List list) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);
    }


}
