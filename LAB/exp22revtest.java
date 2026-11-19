package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp22revtest {

	@Test
	void testReverseNormal() {
		assertEquals("321",exp22rev.reverseNumber(123));
	}
	
	@Test
	void testreversewithzero() {
		assertEquals("021",exp22rev.reverseNumber(120));
	}
	
	 @Test
	    void testReverseSingleDigit() {
	        assertEquals("7", exp22rev.reverseNumber(7));
	    }

}
