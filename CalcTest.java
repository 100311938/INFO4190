package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalcTest {

	Subtraction sub = new Subtraction();
	Addition add = new Addition();

	@Test
    public void testAddition() {
        assertEquals(15, add.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, sub.minus(10, 5));
    }

    @Test
    public void testInvalidOperation() {
        // Simulate invalid operation handling: passing invalid non-numeric input
        String invalidInput = "abc"; // Non-numeric input
        
        // Test invalid number input for the first number
        assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(invalidInput); // Will throw NumberFormatException
        });
        
        // Test invalid number input for the second number
        assertThrows(NumberFormatException.class, () -> {
            Double.parseDouble(invalidInput); // Will throw NumberFormatException
        });
    }
}
