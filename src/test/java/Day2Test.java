import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Day2Test {

    private Day2 d2 = new Day2();

    @Test
    public void testGetSumPartOne() throws IOException {
        assertEquals(42378, d2.getSumPartOne());
    }

    @Test
    public void testGetSumPartTwo() throws IOException {
        assertEquals(246, d2.getSumParTwo());
    }
}
