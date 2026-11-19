package experiments;

public class exp27average {
	 public static double findAverage(int a[]) {

	        int sum = 0;

	        for (int num : a) {
	            sum = sum + num;
	        }

	        return (double) sum / a.length;
	    }

}
