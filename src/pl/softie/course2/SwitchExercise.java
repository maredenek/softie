package pl.softie.course2;

import java.util.Scanner;

public class SwitchExercise {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1, num2;
        String operator;
        System.out.println("podaj liczbe 1");
        num1 = sc.nextInt();
        System.out.println("podaj dzialanie");
        operator = sc.next();
        System.out.println("podaj liczbe 2");
        num2 = sc.nextInt();
        switch (operator) {
            case "add":
            case "+":
                System.out.println(num1 + num2);
                break;
            case "subtract":
            case "-":
                System.out.println(num1 - num2);
                break;
            case "multiply":
            case "*":
                System.out.println(num1 * num2);
                break;
            case "divide":
            case "/":
                System.out.println(num1 / num2);
                break;
            default:
                System.out.print("wrong operator! use + - * /");
        }
    }


}
