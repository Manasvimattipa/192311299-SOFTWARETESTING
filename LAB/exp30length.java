package experiments;

public class exp30length {
	public static int findLength(String s) {

        int count = 0;

        for (char ch : s.toCharArray()) {
            count++;
        }

        return count;
    }

}
