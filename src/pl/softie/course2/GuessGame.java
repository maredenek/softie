package pl.softie.course2;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    static int numberToGuess;

    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        numberToGuess = rand.nextInt(101);
        int answer;
        do {
            System.out.println("guess the number");
            answer = sc.nextInt();
            printMessageFor(answer);
        } while (answer != numberToGuess);
    }

    private static void printMessageFor(int answer) {
        if (answer > numberToGuess) {
            System.out.println("too big");
        } else if (answer < numberToGuess) {
            System.out.println("too small");
        } else {
            System.out.println("correct!!! " + answer);
        }
    }


}
