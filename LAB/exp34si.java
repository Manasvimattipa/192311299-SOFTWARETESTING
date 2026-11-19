package experiments;

public class exp34si {

	 public static double calculateSI(double p, int t, boolean isSenior) {

	        double rate;

	        if (isSenior) {
	            rate = 12;
	        } else {
	            rate = 10;
	        }

	        return (p * rate * t) / 100;
	 }
}
