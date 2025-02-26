import org.example.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {
    private final Calculator calculator = new Calculator();

    @Test
    public void testPower() {
        assertEquals(8.0, Calculator.calculate(2, '^', 3), 0.0001);
        assertEquals(1.0, Calculator.calculate(5, '^', 0), 0.0001);
        assertEquals(0.25, Calculator.calculate(2, '^', -2), 0.0001);
        assertEquals(0.0, Calculator.calculate(0, '^', 5), 0.0001);
    }

    @Test
    public void testSquareRoot() {
        assertEquals(5.0, Calculator.calculate(25, 's', 0), 0.0001);
        assertEquals(0.0, Calculator.calculate(0, 's', 0), 0.0001);
        assertEquals(1.4142, Calculator.calculate(2, 's', 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(-4, 's', 0));
    }

    @Test
    public void testNaturalLog() {
        assertEquals(1.0, Calculator.calculate(Math.E, 'l', 0), 0.0001);
        assertEquals(0.0, Calculator.calculate(1, 'l', 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(-1, 'l', 0));
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(0, 'l', 0));
    }

    @Test
    public void testFactorial() {
        assertEquals(120.0, Calculator.calculate(5, '!', 0), 0.0001);
        assertEquals(1.0, Calculator.calculate(0, '!', 0), 0.0001);
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(-3, '!', 0));
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(3.5, '!', 0));
    }

    @Test
    public void testInvalidOperator() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.calculate(2, 'x', 3));
    }
}