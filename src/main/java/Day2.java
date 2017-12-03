import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day2 {

    public int getSumPartOne() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/input.txt"));
        String firstRow;
        int sum = 0;

        while((firstRow = br.readLine()) != null) {
            List<Integer> list = Stream.of(firstRow.split("\t")).map(Integer::parseInt).collect(Collectors.toList());
            sum += getMaxMinDiff(list);
        }
        return sum;
    }

    public int getSumParTwo() throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/input.txt"));
        String firstRow;
        int sum = 0;

        while((firstRow = br.readLine()) != null) {
            List<Integer> list = Stream.of(firstRow.split("\t")).map(Integer::parseInt).collect(Collectors.toList());
            //Can also sort here and remove one if in 'getDevisorsResult'
            //Collections.sort(set, Collections.reverseOrder());
            sum += getDivisorsResult(list);
        }
        return sum;
    }

    private int getMaxMinDiff(List<Integer> list) {
        return list.stream().max(Integer::compare).get() - list.stream().min(Integer::compare).get();
    }

    private int getDivisorsResult(List<Integer> list) {
        for(int i = 0; i < list.size(); i++) {
            for(int j = i+1; j <= list.size() -1; j++) {
                if(list.get(i) % list.get(j) == 0)
                    return list.get(i)/list.get(j);
                if(list.get(j) % list.get(i) == 0)
                    return list.get(j)/list.get(i);
            }
        }
        return 0;
    }
}
