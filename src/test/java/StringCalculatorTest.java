import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testEmptyStringReturnsZero() {
        StringCalculator calc = new StringCalculator();
        assertEquals(0, calc.add(""));
    }

    @Test
    public void testSingleNumberReturnsItself() {
        StringCalculator calc = new StringCalculator();
        assertEquals(5, calc.add("5"));
    }

    @Test
    public void testTwoNumbersReturnsSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(8, calc.add("3,5"));
    }
}