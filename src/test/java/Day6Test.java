import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day6Test {

    private Day6 d6 = new Day6();

    @Test
    public void testGetIndexOfMax() {
        assertEquals("Index of max should be 2", 2, d6.getIndexOfMax(new Integer[] {1,2,3}));
    }

    @Test
    public void testGetIndexOfMaxWhenEqualValueIsMax() {
        assertEquals("Index of max should be 0", 0, d6.getIndexOfMax(new Integer[] {3,2,3}));
    }

    @Test
    public void testShuffle() {
        Integer[] newArr = d6.shuffle(new Integer[] {0, 2, 7, 0});
        assertEquals(2, newArr[0].intValue());
        assertEquals(4, newArr[1].intValue());
        assertEquals(1, newArr[2].intValue());
        assertEquals(2, newArr[3].intValue());
    }

    @Test
    public void testGetNumberOfTriesExamplePartOne() {
        assertEquals(5, d6.getNumberOfTries(new Integer[] {0, 2, 7, 0}));
    }

    @Test
    public void testGetNumberOfCyclesExamplePartTwo() {
        assertEquals(4, d6.getNumberOfCycles(new Integer[] {0, 2, 7, 0}));
    }

    @Test
    public void testGetNumberOfTriesPartOne() {
        assertEquals(11137, d6.getNumberOfTries(new Integer[] {14, 0, 15, 12, 11, 11, 3, 5, 1, 6, 8, 4, 9, 1, 8, 4}));
    }

    @Test
    public void testGetNumberOfCyclesPartTwo() {
        assertEquals(1037, d6.getNumberOfCycles(new Integer[] {14, 0, 15, 12, 11, 11, 3, 5, 1, 6, 8, 4, 9, 1, 8, 4}));
    }
}
