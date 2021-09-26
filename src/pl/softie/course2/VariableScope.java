package pl.softie.course2;

public class VariableScope {

    private static String globalString;

    public static void main(String[] args) {
        String localString = "2";
        globalString = "1";
        test();
    }

    private static void test() {
        String local = "";
        for(int i = 0; i<10; i++) {
            local = String.valueOf(i);
        }
        System.out.println(globalString);
        System.out.println("incrementer: " + local);
    }


}
