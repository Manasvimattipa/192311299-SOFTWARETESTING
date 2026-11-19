package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp35test {
	 @Test
	    void testPalindromeTrue() {
	        assertTrue(exp35plaindrome.palindrome(121));
	    }

	    @Test
	    void testPalindromeFalse() {
	        assertFalse(exp35plaindrome.palindrome(123));
	    }

	    @Test
	    void testSingleDigitPalindrome() {
	        assertTrue(exp35plaindrome.palindrome(7));
	    }

	

}
