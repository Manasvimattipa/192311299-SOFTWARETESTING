package experiments;

public class exp33voting {

    public static String checkEligibility(int age) {

        if (age >= 18) {
            return "Eligible";
        } 
        else {
            return "Not Eligible";
        }
    }
}