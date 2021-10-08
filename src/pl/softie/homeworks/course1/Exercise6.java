package pl.softie.homeworks.course1;

import java.util.Scanner;

public class Exercise6 {

    public static void main(String[] args) {
        String suffix = "I was read from the terminal";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme first sentence: ");
        String providedString = scanner.nextLine();
        StringBuilder baseString = new StringBuilder(providedString);
        baseString
                .append(" ")
                .append(suffix);
        System.out.println(baseString);
    }

}
