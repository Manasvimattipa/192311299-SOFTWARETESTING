package experiments;

public class exp31reversestring {
	
	public static String reversestring(String s) {
		
	    String ans= "";
		
		int n =s.length();
	
		for(int i=n-1;i>=0;i--) {
			ans+= s.charAt(i);
			
		}
		
		return ans;
		
		
		
		
		
		
		
	}

}
