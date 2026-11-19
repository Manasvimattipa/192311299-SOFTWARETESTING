package experiments;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class exp26test {
    @Test
    void testLargestNormal() {
        assertEquals(9, exp26largest.largest(new int[]{2, 5, 9, 1}));
    }

    @Test
    void testLargestNegative() {
        assertEquals(-1, exp26largest.largest(new int[]{-10, -5, -1, -20}));
    }

    @Test
    void testLargestSameValues() {
        assertEquals(7, exp26largest.largest(new int[]{7, 7, 7}));
    }
}