package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp33test {

	@Test
    void testEligible() {
        assertEquals("Eligible", exp33voting.checkEligibility(20));
    }

    @Test
    void testNotEligible() {
        assertEquals("Not Eligible", exp33voting.checkEligibility(16));
    }

    @Test
    void testBoundaryAge() {
        assertEquals("Eligible", exp33voting.checkEligibility(18));
    }

}
