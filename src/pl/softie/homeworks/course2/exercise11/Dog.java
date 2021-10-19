package pl.softie.homeworks.course2.exercise11;

public class Dog {

    private static int DOG_COUNT = 0;

    public Dog() {
        DOG_COUNT++;
    }

    public static int getDogCount() {
        return DOG_COUNT;
    }
}
