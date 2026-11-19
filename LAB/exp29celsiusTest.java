package experiments;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class exp29celsiusTest {

    @Test
    void testNormal() {
        assertEquals(98.6, exp29celsius.convertToFahrenheit(37), 0.1);
    }

    @Test
    void testZero() {
        assertEquals(32.0, exp29celsius.convertToFahrenheit(0), 0.01);
    }

    @Test
    void testNegative() {
        assertEquals(14.0, exp29celsius.convertToFahrenheit(-10), 0.01);
    }
}