package pl.softie.course4;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample {

    public static void main(String[] args) throws IOException {
        String[] names = {"Arek", "Kasia", "Marcin", "Ewa"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("which element would you like to print?");
        try {
            int element = scanner.nextInt();
            System.out.println(names[element]);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("sorry, provided value is bigger than array size");
        } catch (InputMismatchException e) {
            System.out.println("sorry, provided wrong number");
        }

    }

}
