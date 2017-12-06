import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day4 {


    public int getNoOfValidPasawordsFromFilePartOne() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/day4input.txt"));
        String firstRow;
        int sum = 0;
        while((firstRow = br.readLine()) != null) {
            sum += getNoOfValidPasswordsPartOne(firstRow);
        }
        return sum;
    }

    public int getNoOfValidPasswordsPartOne(final String input) {
        Map<String, Integer> passMap = new HashMap<>();
        for(String phrase : Arrays.asList(input.split(" "))) {
            if(passMap.containsKey(phrase)) {
                return 0;
            }
            passMap.put(phrase, 0);
        }
        return 1;
    }

    public int getNoOfValidPasawordsFromFilePartTwo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/day4input.txt"));
        String firstRow;
        int sum = 0;
        while((firstRow = br.readLine()) != null) {
            sum += getNoOfValidPasswordsPartTwo(firstRow);
        }
        return sum;
    }

    public int getNoOfValidPasswordsPartTwo(final String input) {
        List<String> words = Arrays.asList(input.split(" "));
        Set<String> sortedSet = new TreeSet<>();
        for(String word : words) {
            String sortedWord = getSortedWord(word);
            sortedSet.add(sortedWord);
        }
        return sortedSet.size() == words.size() ? 1 : 0;
    }

    public String getSortedWord(String word) {
        return Stream.of(word.split("")).sorted().collect(Collectors.joining());
    }
}
