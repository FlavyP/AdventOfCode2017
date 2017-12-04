import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Day4Test {

    private Day4 d4 = new Day4();

    @Test
    public void testExamples() {
        assertEquals(1, d4.getNoOfValidPassphrases("aa bb cc dd ee"));
        assertEquals(0, d4.getNoOfValidPassphrases("aa bb cc dd aa"));
        assertEquals(1, d4.getNoOfValidPassphrases("aa bb cc dd aaa"));
    }

    @Test
    public void testMyInput() {
        assertEquals(1, d4.getNoOfValidPassphrasesFromFile());
    }
}
