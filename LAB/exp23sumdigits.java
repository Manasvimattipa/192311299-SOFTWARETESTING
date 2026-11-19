package experiments;

public class exp23sumdigits {
	
	public static int sumdigit(int n) {
		
		int num =Math.abs(n);
		
		int sum=0;
		
		while(num!=0) {
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		
		return sum;
		
	}
	
	

}
