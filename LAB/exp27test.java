package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp27test {

	 @Test
	    void testAverageNormal() {
	        assertEquals(3.0, exp27average.findAverage(new int[]{1, 2, 3, 4, 5}), 0.01);
	    }

	    @Test
	    void testAverageSingle() {
	        assertEquals(10.0, exp27average.findAverage(new int[]{10}), 0.01);
	    }

	    @Test
	    void testAverageZeros() {
	        assertEquals(0.0, exp27average.findAverage(new int[]{0, 0, 0}), 0.01);
	    }

}
