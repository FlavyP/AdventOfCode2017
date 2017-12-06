import java.util.*;

public class Day6 {

    public int getNumberOfTries(Integer[] arr) {
        int tries = 1;
        Integer[] newArr = shuffle(arr);
        List<Integer[]> allArrays = new ArrayList<>();
        boolean unique = true;
        allArrays.add(Arrays.copyOf(newArr, newArr.length));

         while(unique) {
             newArr = shuffle(newArr);
             if(arrayUniqueInList(allArrays, newArr)) {
                 allArrays.add(Arrays.copyOf(newArr, newArr.length));
             } else {
                 unique = false;
             }
             tries++;
         }
        return tries;
    }

    public boolean arrayUniqueInList(List<Integer[]> allArrays, Integer[] newArr) {
        for(Integer[] arr : allArrays) {
            if(Arrays.equals(arr, newArr)) {
                return false;
            }
        }
        return true;
    }

    public Integer[] shuffle(Integer[] arr) {
        int indexOfMax = getIndexOfMax(arr);
        int blocks = arr[indexOfMax];
        int nextIndex = indexOfMax+1 >= arr.length ? 0 : indexOfMax+1;
        arr[indexOfMax] = 0;
        while(blocks != 0) {
            arr[nextIndex] += 1;
            nextIndex++;
            if (nextIndex >= arr.length) {
                nextIndex = 0;
            }
            blocks--;
        }
        return arr;
    }

    public int getIndexOfMax(Integer[] arr) {
        int indexOfMax = 0;
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                indexOfMax = i;
            }
        }
        return indexOfMax;
    }
}
