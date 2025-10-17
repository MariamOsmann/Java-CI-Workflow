import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        assertEquals(5, calc.add(2, 3));
    }
    @Test
    void testSubtract() {
        Calculator c = new Calculator();
        assertEquals(4, c.subtract(5, 3));
    }

    @Test
    void testMultiply() {
        Calculator c = new Calculator();
        assertEquals(15, c.multiply(5, 3));
    }
}