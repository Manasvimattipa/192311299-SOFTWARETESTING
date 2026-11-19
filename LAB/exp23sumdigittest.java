package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp23sumdigittest {

	@Test
		void testvalidsum() {
			assertEquals(6,exp23sumdigits.sumdigit(123));
		}
	
	@Test
	void testinvalidsum() {
		assertNotEquals(2,exp23sumdigits.sumdigit(777));
		
	}
	
	@Test
	void negvalidsum() {
		assertEquals(5,exp23sumdigits.sumdigit(-41));
	}
		
	}

