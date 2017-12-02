public class Day1 {

    public int getInputSumPartOne(final String input) {
        int sum = 0;
        int firstNumber = getIntVal(input.charAt(0));
        char[] inputArray = input.toCharArray();

        for(int i =0; i < inputArray.length-1; i++) {
            int number = getIntVal(inputArray[i]);
            int nextNo = getIntVal(inputArray[i+1]);
            if(number == nextNo) {
                sum += number;
            }
        }
        int lastNo = getIntVal(inputArray[inputArray.length-1]);
        if(firstNumber == lastNo) {
            sum+= firstNumber;
        }
        return sum;
    }

    public int getIntVal(char c) {
        return Character.getNumericValue(c);
    }
}
