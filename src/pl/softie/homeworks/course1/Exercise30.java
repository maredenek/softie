package pl.softie.homeworks.course1;

import java.util.Arrays;
import java.util.function.Function;

import static java.util.stream.IntStream.of;

public class Exercise30 {



    public static void main(String[] args) {

        int[] arrayOfNumbers = {1,2,3,4,5,6,7,8,9,10};
        multiplyFromOneToTen(arrayOfNumbers);
        multiplyFromOneToTenWithoutAdditionalVariable(arrayOfNumbers);
        multiplyFromOneToTenJava8(arrayOfNumbers);
    }

    private static void multiplyFromOneToTen(int[] arr) {
        int multiplyingFactor = 1;
        System.out.println("With additional variable:");
        while (multiplyingFactor < 11) {
            for(int i : arr) {
                System.out.print(i * multiplyingFactor);
                System.out.print("\t");
            }
            System.out.print("\n");
            multiplyingFactor++;
        }
    }

    private static void multiplyFromOneToTenWithoutAdditionalVariable(int[] arr) {
        System.out.println("Without additional variable:");
        for(int i : arr) {
            for (int j : arr) {
                System.out.print(i * j);
                System.out.print("\t");
            }
            System.out.print("\n");
        }
    }

    private static void multiplyFromOneToTenJava8(int[] arr) {
        System.out.println("Java8 style:");
        int multiplyingFactor = 1;
        while(multiplyingFactor < 11) {
            int[] multipliedArr = multiplyAllElementsOf(arr).apply(multiplyingFactor);
            System.out.println(Arrays.toString(multipliedArr));
            multiplyingFactor++;
        }
    }

    private static Function<Integer, int[]> multiplyAllElementsOf(int[] arr) {
        return i -> of(arr).map(a -> a*i).toArray();
    }

}
