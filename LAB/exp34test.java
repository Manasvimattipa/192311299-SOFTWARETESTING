package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp34test {

	@Test
    void testSeniorCitizen() {
        assertEquals(1200.0, exp34si.calculateSI(10000, 1, true), 0.01);
    }

    @Test
    void testNormalCustomer() {
        assertEquals(1000.0, exp34si.calculateSI(10000, 1, false), 0.01);
    }

    @Test
    void testSeniorCitizenTwoYears() {
        assertEquals(2400.0, exp34si.calculateSI(10000, 2, true), 0.01);
    }
}
