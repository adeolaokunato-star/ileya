import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTaskThree{
    @Test
    public void testPerfectSquares(){
        int[] number   = {4, 7, 9, 10, 16, 18};
        int[] expected = {4, 9, 16};
        int[] actual   = TaskThree.perfectSquares(number);
        assertArrayEquals(expected, actual);
    }
}
