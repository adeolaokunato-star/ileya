import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestTaskOne{
    @Test
    public void testThatArraysAreMergedAndSorted(){
        int[] numberOne = {3, 5, 1};
        int[] numberTwo = {2, 4, 6};
        int[] actual    = TaskOne.sorting(numberOne, numberTwo);
        int[] expected  = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, actual);
    }
}
