package pl.softie.course3.fluentsetters;

public class Runner {

    public static void main(String[] args) {
        MyObject test1 = new MyObject();
        // approach 1
        test1.setFiled1(1);
        test1.setFiled2(2);
        test1.setFiled3(3);
        test1.setFiled4(4);

        // approach 2
        test1.setFiled1(1)
                .setFiled2(2)
                .setFiled3(3)
                .setFiled4(4);
    }

}
