package experiments;

public class exp35plaindrome {
	
	public static boolean  palindrome(int n) {
		 int original = n;
	        int rev = 0;

	        while (n != 0) {
	            int digit = n % 10;
	            rev = rev * 10 + digit;
	            n = n / 10;
	        }

	        return rev == original;
		
		
	}

}
