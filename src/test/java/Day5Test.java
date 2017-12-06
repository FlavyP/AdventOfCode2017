import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day5Test {

    private Day5 d5 = new Day5();

    @Test
    public void testFilePartOne() throws IOException {
        assertEquals(373160, d5.getStepsToEvadePartOne(d5.buildArrayFromFile()));
    }
    @Test
    public void testFilePartTwo() throws IOException {
        assertEquals(373160, d5.getStepsToEvadePartTwo(d5.buildArrayFromFile()));
    }

    @Test
    public void testExamplePartOne() throws IOException {
        int[] arr = new int[] {0,3,0,1,-3};
        assertEquals(5, d5.getStepsToEvadePartOne(arr));
    }

    @Test
    public void testExamplePartTwo() throws IOException {
        int[] arr = new int[] {0,3,0,1,-3};
        assertEquals(10, d5.getStepsToEvadePartTwo(arr));
    }
}
