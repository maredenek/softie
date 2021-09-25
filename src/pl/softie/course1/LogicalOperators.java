package pl.softie.course1;

import java.util.Arrays;

public class LogicalOperators {

    public static void main(String[] args) {
        System.out.println(containsThreeAtLeastTwoTimes(1,1,1));
        System.out.println(containsThreeAtLeastTwoTimes(3,3,3));
        System.out.println(containsThreeAtLeastTwoTimes(1,3,3));
        System.out.println(containsThreeAtLeastTwoTimes(1,1,3));
        System.out.println(containsThreeAtLeastTwoTimes(1,1,3,4,5));
        System.out.println(containsThreeAtLeastTwoTimesJava8(1,1,3,4,5));
    }

    private static boolean containsThreeAtLeastTwoTimes(Integer... numbers) {
        int counter = 0;
        for (Integer i : numbers) {
            if(i==3) counter++;
            if(counter==2){
                return true;
            }
        }
        return false;
    }

    private static boolean containsThreeAtLeastTwoTimesJava8(Integer... numbers) {
        long occurrenceNumber = Arrays.stream(numbers)
                .filter(number -> number.equals(3))
                .count();
        return occurrenceNumber >= 2;
    }

}
