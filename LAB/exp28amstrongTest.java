package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp28amstrongTest {
	
	
	 @Test
	    void testArmstrongTrue() {
	        assertTrue(exp28amstrong.amstrong(153));
	    }

	    @Test
	    void testArmstrongFalse() {
	        assertFalse(exp28amstrong.amstrong(123));
	    }

	    @Test
	    void testArmstrongSingleDigit() {
	        assertTrue(exp28amstrong.amstrong(7));
	    }
	

}
