package experiments;

public class exp26largest {

	public static int largest(int a[]) {
		
		int c= Integer.MIN_VALUE;
		
		for(int i=0;i<a.length;i++) {
			
			if(c<a[i]) {
				c=a[i];
			}
			
		}
		
		return c;
		
		
		
		
		
	}
}
