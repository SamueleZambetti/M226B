import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testAdd() {
        Calculator calc = new Calculator();
        int result = calc.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testDivide() {
        Calculator calc = new Calculator();
        int result = calc.divide(10, 2);
        assertEquals(5, result);
    }
}
