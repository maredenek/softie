package pl.softie.homeworks.course1;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a sentence: ");
        String providedString = scanner.nextLine();
        System.out.println(providedString.toLowerCase());
    }

}
