package experiments;

public class exp32stringcompare {

    public static boolean compareStrings(String s1, String s2) {

        if (s1 == null || s2 == null) {
            return false;
        }

        return s1.equals(s2);
    }
}