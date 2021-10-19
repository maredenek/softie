package pl.softie.homeworks.course2;

public class Exercise12 {

    public static void main(String[] args) {
        System.out.println(calculateBMI(80, 1.5));
        System.out.println(calculateBMI(80, 1.8));
        System.out.println(calculateBMI(80, 2.0));
    }

    public static double calculateBMI(Integer weight, double height) {
        return weight / (height * height);
    }

}
