package pl.softie.homeworks.course2;

public class Exercise13 {

    public static void main(String[] args) {
        System.out.println(concatenateGivenTimesUsingLoop("test", 5));
        System.out.println(concatenateGivenTimes("test", 5));
    }

    public static String concatenateGivenTimesUsingLoop(String s, int numberOfTimes) {
        StringBuilder temp = new StringBuilder();
        for(int i=0; i<numberOfTimes; i++) {
            temp.append(s);
        }
        return temp.toString();
    }

    public static String concatenateGivenTimes(String s, int numberOfTimes) {
        StringBuilder temp = new StringBuilder();
        temp.append(String.valueOf(s).repeat(Math.max(0, numberOfTimes)));
        return temp.toString();
    }
}
