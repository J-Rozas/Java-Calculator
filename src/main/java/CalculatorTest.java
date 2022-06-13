import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(5, calculator.add(1, 4));
    }

    @Test
    public void canSubtract() {
        assertEquals(7, calculator.subtract(10, 3));
    }

    @Test
    public void canMultiply() {
        assertEquals(72, calculator.multiply(8, 9));
    }
}
