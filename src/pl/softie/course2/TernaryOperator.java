package pl.softie.course2;

import java.util.Scanner;

public class TernaryOperator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Gimme your age");
        int age = scanner.nextInt();
        //*
        if(age<18) System.out.println("You're not an adult.");
        else System.out.println("You're an adult.");
        /*/
        String message = (age<18) ? "You're not an adult." : "You're an adult.";
        System.out.println(message);
        //*/
    }

}
