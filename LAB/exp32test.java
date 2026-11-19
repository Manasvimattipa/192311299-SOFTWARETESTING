package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp32test {

	 @Test
	    void testEqualStrings() {
	        assertTrue(exp32stringcompare.compareStrings("Java", "Java"));
	    }

	    @Test
	    void testDifferentStrings() {
	        assertFalse(exp32stringcompare.compareStrings("Java", "Python"));
	    }

	    @Test
	    void testNullString() {
	        assertFalse(exp32stringcompare.compareStrings(null, "Test"));
	    }
	

}
