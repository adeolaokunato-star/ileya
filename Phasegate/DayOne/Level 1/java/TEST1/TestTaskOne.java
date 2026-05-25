import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTaskOne {
    @Test
    public void testEvenNumbers() {
        int[] number   = {45, 60, 3, 10, 9, 22};
        int[] expected = {60, 10, 22};
        int[] actual   = TaskOne.evenNumbers(number);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testOddNumbers() {
        int[] number   = {45, 60, 3, 10, 9, 22};
        int[] expected = {45, 3, 9};
        int[] actual   = TaskOne.oddNumbers(number);
        assertArrayEquals(expected, actual);
    }
}
