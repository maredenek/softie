package pl.softie.homeworks.course1;

import java.util.Scanner;

public class Exercise5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme first sentence: ");
        String firstString = scanner.nextLine();
        System.out.println("Gimme second sentence: ");
        String secondString = scanner.nextLine();

        if (firstString.length() == secondString.length()) {
            System.out.println("Strings length are the same");
        } else {
            System.out.println("Strings length are not the same");
            System.out.println("Longer one: " + getLongerString(firstString, secondString));
        }
    }

    private static String getLongerString(String firstString, String secondString) {
        if (firstString.length() > secondString.length()) return firstString;
        else return secondString;
    }


}
