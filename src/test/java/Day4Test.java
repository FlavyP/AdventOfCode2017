import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.assertEquals;

public class Day4Test {

    private Day4 d4 = new Day4();

    @Test
    public void testExamplesPartOne() {
        assertEquals(1, d4.getNoOfValidPasswordsPartOne("aa bb cc dd ee"));
        assertEquals(0, d4.getNoOfValidPasswordsPartOne("aa bb cc dd aa"));
        assertEquals(1, d4.getNoOfValidPasswordsPartOne("aa bb cc dd aaa"));
    }

    @Test
    public void testMyInputPartOne() throws IOException {
        assertEquals(383, d4.getNoOfValidPasawordsFromFilePartOne());
    }

    @Test
    public void testExamplesPartTwo() throws IOException {
        assertEquals(1, d4.getNoOfValidPasswordsPartTwo("abcde fghij"));
        assertEquals(0, d4.getNoOfValidPasswordsPartTwo("abcde xyz ecdab"));
        assertEquals(1, d4.getNoOfValidPasswordsPartTwo("a ab abc abd abf abj"));
        assertEquals(1, d4.getNoOfValidPasswordsPartTwo("iiii oiii ooii oooi oooo"));
        assertEquals(0, d4.getNoOfValidPasswordsPartTwo("oiii ioii iioi iiio"));
    }

    @Test
    public void testMyInputPartTwo() throws IOException {
        assertEquals(265, d4.getNoOfValidPasawordsFromFilePartTwo());
    }
}
