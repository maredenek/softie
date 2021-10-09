package pl.softie.course3.exercise3;

public class Runner {

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(2,3);
        Rectangle rect2 = new Rectangle(5,7);
        Rectangle square = new Rectangle(4);

        System.out.println(rect1.calculateArea());
        System.out.println(rect2.calculateArea());
        System.out.println(square.calculateArea());

    }

}
