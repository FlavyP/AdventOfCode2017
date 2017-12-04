import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day4 {

    public int getNoOfValidPassphrasesFromFile() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/day4input.txt"));
        String firstRow;
        int sum = 0;
        while((firstRow = br.readLine()) != null) {
            sum += getNoOfValidPassphrases(firstRow);
        }
        return sum;
    }

    public int getNoOfValidPassphrases(final String input) {
        Map<String, Integer> passMap = new HashMap<>();
        for(String phrase : Arrays.asList(input.split(" "))) {
            if(passMap.containsKey(phrase)) {
                return 0;
            }
            passMap.put(phrase, 0);
        }
        return 1;
    }
}
