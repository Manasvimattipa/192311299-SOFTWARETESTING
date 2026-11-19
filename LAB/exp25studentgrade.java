package experiments;

public class exp25studentgrade {

    public static String calculateGrade(int marks) {

        if (marks >= 90) {
            return "A";
        } 
        else if (marks >= 75) {
            return "B";
        } 
        else if (marks >= 50) {
            return "C";
        } 
        else {
            return "F";
        }
    }
}