import com.google.common.primitives.Chars;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Day1 {

    public int getInputSumPartOne(final String input) {
        List<Integer> circularArray = Chars.asList(input.toCharArray()).stream().map(i -> Character.getNumericValue(i)).collect(Collectors.toList());
        circularArray.add(circularArray.get(0));

        int sum = 0;
        for(int i =0; i < circularArray.size() - 1; i++) {
            if(circularArray.get(i) == circularArray.get(i+1)) {
                sum += circularArray.get(i);
            }
        }
        return sum;
    }

    public int getInputSumPartTwo(final String input) {
        //There has to be a better way of doing this, it just has to be
        List<Integer> circularArray = Chars.asList(input.toCharArray()).stream().map(i -> Character.getNumericValue(i)).collect(Collectors.toList());

        int sum = 0;
        for(int i = 0; i < circularArray.size(); i++) {
            int index = resolveIndex(i, circularArray.size());
            if(circularArray.get(i) == circularArray.get(index)) {
                sum += circularArray.get(i);
            }
        }
        return sum;
    }

    public int resolveIndex(int i, int size) {
        int nextIndex = i+size/2;
        return nextIndex > size-1 ? nextIndex - size : nextIndex;
    }
}
