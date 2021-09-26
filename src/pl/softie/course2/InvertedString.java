package pl.softie.course2;

import java.util.Scanner;

public class InvertedString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gimme a string");
        String providedString = sc.nextLine();
        printInvertedString(providedString);
    }

    private static void printInvertedString(String input) {
        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
    }

}
