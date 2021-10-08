package pl.softie.homeworks.course1;

public class Exercise7 {

    public static void main(String[] args) {
        String givenStr = "Uwielbiam kodować w Javie";
        String givenStr2 = "Bardzo uwielbiam kodować w Javie ale też w C++";
        String lookUpString = "kodować";
        String part1, part2, part3;

        String stringUnderTest = givenStr2;
        part1 = getSubstringFromBeginningToFirstOccurrenceOf("m", stringUnderTest);
        part2 = getSubstringFromFirstOccurrenceOfLookUpWithGivenLength(lookUpString, stringUnderTest);
        part3 = stringUnderTest.substring(stringUnderTest.indexOf('J'));

        System.out.println("Part 1: " + part1);
        System.out.println("Part 2: " + part2);
        System.out.println("Part 3: " + part3);
    }

    private static String getSubstringFromBeginningToFirstOccurrenceOf(String lookUpStr, String givenString) {
        int indexOfFirstOccurrence = givenString.indexOf(lookUpStr) + 1;
        return givenString.substring(0, indexOfFirstOccurrence);
    }

    private static String getSubstringFromFirstOccurrenceOfLookUpWithGivenLength(String lookUpStr, String givenString) {
        int indexOfFirstOccurrence = givenString.indexOf(lookUpStr);
        int indexOfLastCharOfLookUp = indexOfFirstOccurrence + lookUpStr.length();
        return givenString.substring(indexOfFirstOccurrence, indexOfLastCharOfLookUp);
    }

}
