import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class TestStudentGrade{
    @Test
    public void testCalculateTotal(){
        int[] scores = {67, 21, 49};
        int expected = 137;
        int actual = StudentGrade.calculateTotal(scores);
        assertEquals(expected, actual);
    }
    @Test
    public void testCalculatePosition(){
        int[] totals = {137, 216, 154, 227};
        int expected = 4;
        int actual = StudentGrade.calculatePosition(totals, 0);
        assertEquals(expected, actual);
    }
    @Test
    public void testStudentsFailed(){
        int[][] scores = {{67, 21, 50}, {98, 62, 56}, {93, 51, 55}, {78, 83, 66}};
        int expected = 1;
        int actual = StudentGrade.studentsFailed(scores, 1);
        assertEquals(expected, actual);
    }
    @Test
    public void testStudentsPassed(){
        int[][] scores = {{67, 66, 50}, {98, 62, 56}, {93, 51, 55}, {78, 83, 66}};
        int expected = 4;
        int actual = StudentGrade.studentsPassed(scores, 1);
        assertEquals(expected, actual);
    }
        
    
    
    
    
    
}
