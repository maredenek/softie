package pl.softie.course1;

import java.util.Scanner;

public class ZipCode {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("type your zip code");
        String zipCode = scanner.nextLine();
        if (is6CharactersLong(zipCode) && containsDashAsAThirdCharacter(zipCode) && containsDigits(zipCode)) { // alternatively: if( zipCode.matches("\\d\\d-\\d\\d\\d") )
            System.out.println("zipcode correct");
        } else {
            System.out.println("incorrect zipcode");
        }
    }

    static boolean is6CharactersLong(String zipCode) {
        return zipCode.length() == 6;
    }

    static boolean containsDashAsAThirdCharacter(String zipCode) {
        return zipCode.charAt(2) == '-';
    }

    static boolean containsDigits(String zipCode) {
        return Character.isDigit(zipCode.charAt(0)) &&
                Character.isDigit(zipCode.charAt(1)) &&
                Character.isDigit(zipCode.charAt(3)) &&
                Character.isDigit(zipCode.charAt(4)) &&
                Character.isDigit(zipCode.charAt(5));
    }

}
