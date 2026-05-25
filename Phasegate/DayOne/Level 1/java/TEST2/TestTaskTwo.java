import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTaskOne{
    @Test
    public void testReplaceNonPerfectSquares(){
        int[] number   = {4, 7, 9, 10, 49, 6};
        int[] expected = {9, -1, 9, -1, 49, -1};
        int[] actual   = TaskOne.replaceNonPerfectSquares(number);
        assertArrayEquals(expected, actual);
    }
}
