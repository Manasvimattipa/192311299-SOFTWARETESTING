package experiments;

public class exp28amstrong {
	
	public static boolean amstrong(int n) {
		if(n<0) {
			return false;
		}
		
		int count=0;
		int original=n;
		int temp= n;
		while(n!=0) {
			n=n/10;
			count++;
			
		}
		
		int sum=0;
		while(temp!=0) {
			
			int rem=temp%10;
			sum+=Math.pow(rem,count);
			temp=temp/10;
			
			
		}
		
		
		return sum==original;
	}

}
