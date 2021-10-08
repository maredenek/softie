package pl.softie.homeworks.course1;

import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme first sentence: ");
        String firstString = scanner.nextLine();
        System.out.println("Gimme second sentence: ");
        String secondString = scanner.nextLine();
        String message = firstString.equals(secondString) ? "equals" : "not equals" ;
        System.out.println(firstString + " is " + message + " to " + secondString);
    }

}
