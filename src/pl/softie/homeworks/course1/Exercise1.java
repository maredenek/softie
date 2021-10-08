package pl.softie.homeworks.course1;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme a sentence: ");
        String providedString = scanner.nextLine();
        System.out.println("Number of characters: " + providedString.length());
        System.out.println("First character: " + providedString.charAt(0));
        System.out.println("Last character: " + providedString.charAt(providedString.length()-1));
        System.out.println("Middle character: " + providedString.charAt(providedString.length()/2));

        Integer index = getIndexOfFirstOccurrence("a", providedString);
        String message =  index<0 ? "There's no 'a' inside provided string" : "Index of first occurrence of 'a': " + index;
        System.out.println(message);
    }

    private static Integer getIndexOfFirstOccurrence(String expectedChar, String source) {
        return source.indexOf(expectedChar);
    }

}
