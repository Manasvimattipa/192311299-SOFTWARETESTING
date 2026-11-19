package experiments;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class exp31test {
	@Test
    void testNormal() {
        assertEquals("olleH", exp31reversestring.reversestring("Hello"));
    }

    @Test
    void testSingleCharacter() {
        assertEquals("A", exp31reversestring.reversestring("A"));
    }

    @Test
    void testWithSpaces() {
        assertEquals("dlroW olleH", exp31reversestring.reversestring("Hello World"));
    }

}
