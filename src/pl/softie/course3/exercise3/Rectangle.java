package pl.softie.course3.exercise3;

public class Rectangle {

    final Integer a;
    final Integer b;

    public Rectangle(Integer a) {
        this(a,a);
    }

    public Integer getA() {
        return a;
    }

    public Rectangle(Integer a, Integer b) {
        this.a = a;
        this.b = b;
    }

    public Integer calculateArea() {
        return this.a * this.b;
    }

}
