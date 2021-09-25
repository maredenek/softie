package pl.softie.course1;

import java.util.Scanner;

public class ScannerExercise {

    public static void main(String[] args) {
        Scanner myScannerObject = new Scanner(System.in);
        System.out.println("Enter your PESEL: ");
        String input = myScannerObject.nextLine();
        checkIfPeselNumberLengthIsCorrect(input);
        int i = Integer.parseInt(input.substring(9, 10));
        checkIfItsWomanOrMan(i);
    }

    public static void checkIfPeselNumberLengthIsCorrect(String input) {
        if (input.length() != 11) {
            System.out.println("Wrong PESEL number");
        }
    }

    public static void checkIfItsWomanOrMan(int i) {
        if (i % 2 == 0) {
            System.out.println("You're a woman");
        } else {
            System.out.println("You're a man");
        }
    }

}
