package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp25test {

	@Test
	void testgradeA() {
		assertEquals("A",exp25studentgrade.calculateGrade(98));
	}
	
	@Test
	void testgradeB() {
		assertEquals("B",exp25studentgrade.calculateGrade(89));
	}
	
	@Test
	void testgradeC() {
		assertEquals("C",exp25studentgrade.calculateGrade(74));
	}
	
	@Test
	void testgradeF() {
		assertEquals("F",exp25studentgrade.calculateGrade(21));
	}

}
