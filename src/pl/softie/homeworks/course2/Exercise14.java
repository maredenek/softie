package pl.softie.homeworks.course2;

import java.util.Arrays;
import java.util.Collections;

public class Exercise14 {

    public static void main(String[] args) {
        int[] unsortedArr = {4,5,6,7};
        int[] unsortedArrJava = {4,5,6,7};
        System.out.println(Arrays.toString(sortDesc(unsortedArr)));
        System.out.println(Arrays.toString(sortDescJava8(unsortedArrJava)));
    }

    public static int[] sortDescJava8(int[] source) {
        return Arrays.stream(source)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
    }

    public static int[] sortDesc(int[] source) {
        Arrays.sort(source);
        int[] reversedArr = new int[source.length];
        int currentElementIndex = 0;
        for (int i = source.length-1; i>=0; i--) {
            reversedArr[currentElementIndex++] = source[i];
        }
        return reversedArr;
     }

}
