package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp24test {

	@Test
	void testinvalid() {
		assertFalse(exp24stringcompare.stringequal("mango","apple"));
	}
	
	@Test
	void testtrue() {
		assertTrue(exp24stringcompare.stringequal("manasvi", "Manasvi"));
	}
	
	@Test
	void testnull() {
		assertFalse(exp24stringcompare.stringequal(null, "software"));
	}

}
