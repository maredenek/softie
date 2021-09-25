package pl.softie.course1;

import java.util.List;
import java.util.Scanner;

public class Ex5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your current password");
        String oldOne = scanner.nextLine();
        System.out.println("type your new password");
        String newOne = scanner.nextLine();
        if (!oldOne.equals(newOne) && newOne.length() >= 6 && containsSpecialCharacter(newOne)) {
            System.out.println("password saved");
        } else {
            System.out.println("incorrect password doesn't meet criteria");
        }
    }

    private static boolean containsSpecialCharacter(String str) {
        List<String> requiredCharacters = List.of("!", "@", "#", "$", "(", ")");
        for(String specialChar : requiredCharacters) {
            if (str.contains(specialChar)) return true;
        }
        return false;
    }

}
