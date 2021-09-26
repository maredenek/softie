package pl.softie.course2;

import java.util.Scanner;

public class LockingAccount {

    static int tryNumber = 0;

    public static void main(String[] args) {
        String password = "qwerty123";
        String guessedPassword;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("guess the password");
            guessedPassword = sc.nextLine();
            tryNumber++;
            if (!guessedPassword.equals(password)) {
                if (tryNumber == 3) {
                    System.out.println("account locked");
                    break;
                } else {
                    System.out.println("wrong password");
                }
            } else {
                System.out.println("correct!");
            }
        }

        while (!guessedPassword.equals(password));
    }

    private static void checkIfNumberOfRetriesIsExceeded() {

    }


}
