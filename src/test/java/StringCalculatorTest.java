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

    @Test
    public void testMultipleNumbersReturnsSum() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1,2,3"));
        assertEquals(15, calc.add("1,2,3,4,5"));
        assertEquals(100, calc.add("10,20,30, 40"));
    }

    @Test
    public void testNumbersWithNewlinesAndCommas() {
        StringCalculator calc = new StringCalculator();
        assertEquals(6, calc.add("1\n2,3"));
        assertEquals(10, calc.add("2\n3\n5"));
        assertEquals(15, calc.add("5,5\n5"));
    }


}