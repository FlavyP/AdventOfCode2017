import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day2 {

    public int getSumPartOne() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/input.txt"));
        String firstRow;
        int sum = 0;

        while((firstRow = br.readLine()) != null) {
            List<Integer> set = Stream.of(firstRow.split("\t")).map(Integer::parseInt).collect(Collectors.toList());
            sum += getMaxMinDiff(set);
        }
        return sum;
    }

    private int getMaxMinDiff(List<Integer> set) {
        return set.stream().max(Integer::compare).get() - set.stream().min(Integer::compare).get();
    }
}
