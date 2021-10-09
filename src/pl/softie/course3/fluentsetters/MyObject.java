package pl.softie.course3.fluentsetters;

public class MyObject {

    private Integer filed1;
    private Integer filed2;
    private Integer filed3;
    private Integer filed4;

    public MyObject setFiled1(int filed1) {
        this.filed1 = filed1;
        return this;
    }

    public MyObject setFiled2(int filed2) {
        this.filed2 = filed2;
        return this;
    }

    public MyObject setFiled3(int filed3) {
        this.filed3 = filed3;
        return this;
    }

    public MyObject setFiled4(int filed4) {
        this.filed4 = filed4;
        return this;
    }
}
