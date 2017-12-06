import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Day5 {

    public int[] buildArrayFromFile() throws IOException {
        List<Integer> moves = new ArrayList<>();
        String firstRow;
        BufferedReader br = new BufferedReader(new FileReader("src/test/resources/day5input.txt"));
        while((firstRow = br.readLine()) != null) {
            moves.add(Integer.valueOf(firstRow));
        }
        System.out.println(moves);
        return moves.stream().mapToInt(i -> i).toArray();
    }

    public int getStepsToEvade(int[] moves) throws IOException {
        int steps = 0;
        int currentIndex;

        for(int i = 0; i < moves.length; i++) {
            int val = moves[i];
            if(val == 0) {
                moves[i] = 1;
                currentIndex = i;
                i--;
                steps++;
            }
            else {
                moves[i] = val+1;
                i+=val-1;
                currentIndex = i;
                steps++;
            }
            if(currentIndex < 0 || currentIndex > moves.length) {
                return steps;
            }
        }
        return steps;
    }
}
