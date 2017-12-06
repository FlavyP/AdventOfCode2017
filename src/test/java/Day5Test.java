import org.junit.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class Day5Test {

    private Day5 d5 = new Day5();

    @Test
    public void test() throws IOException {
        assertEquals(373160, d5.getStepsToEvade(d5.buildArrayFromFile()));
    }

    @Test
    public void testExamplePartOne() throws IOException {
        int[] arr = new int[] {0,3,0,1,-3};
        assertEquals(5, d5.getStepsToEvade(arr));
    }
}
