package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp30test {

	
	@Test
    void testNormal() {
        assertEquals(7, exp30length.findLength("manasvi"));
    }

    @Test
    void testEmpty() {
        assertEquals(0, exp30length.findLength(""));
    }

    @Test
    void testWithSpaces() {
        assertEquals(11, exp30length.findLength("Hello World"));
    }

}
