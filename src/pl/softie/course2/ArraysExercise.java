package pl.softie.course2;

import java.util.Arrays;
import java.util.List;

public class ArraysExercise {

    public static void main(String[] args) {
        Integer[] arrayWith77 = {12, 2, 2, 12, 13, 77, 33};
        Integer[] arrayWithout77 = {12, 2, 2, 12, 13, 33};
        Integer[] allProhibitedNumbers = {1, 2, 2};
        //check whether array contains element with value 77
        if (containsNumber77(arrayWithout77)) {
            System.out.println("Contains!");
        } else {
            System.out.println("Not contains");
        }
        //copying arrays
        Integer[] copiedArray = copyArray(arrayWith77);
        System.out.println(Arrays.toString(arrayWith77));
        System.out.println(Arrays.toString(copiedArray));
        //return first and last element
        System.out.println(Arrays.toString(prepareArrayWithFirstAndLastElementOfArray(arrayWith77)));
        //sum all elements except 1, 2, 3
        System.out.println("Sum : " + sumOfNumberExcept123(allProhibitedNumbers));
        System.out.println("Sum : " + sumOfNumberExcept123(arrayWith77));
    }

    private static boolean containsNumber77(Integer[] arr) {
        return Arrays.asList(arr).contains(77);
    }

    private static Integer[] copyArray(Integer[] arrayToBeCopied) {
        return Arrays.copyOf(arrayToBeCopied, arrayToBeCopied.length);
    }

    static Integer[] prepareArrayWithFirstAndLastElementOfArray(Integer[] originalArray) {
        if (originalArray.length > 0) {
            int lastIndex = originalArray.length == 1 ? 0 : originalArray.length - 1;
            Integer[] newArr = new Integer[2];
            newArr[0] = originalArray[0];
            newArr[1] = originalArray[lastIndex];
            return newArr;
        } else {
            return originalArray;
        }
    }

    static Integer sumOfNumberExcept123(Integer[] arr) {
        List<Integer> prohibitedNumbers = List.of(1,2,3);
        return Arrays.stream(arr)
                .filter(integer -> !prohibitedNumbers.contains(integer))
                .mapToInt(Integer::intValue)
                .sum();
    }

}
