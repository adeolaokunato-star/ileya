public class TaskOne{
    public static int[] moveZerosToEnd(int[] numbers){
        int nonZeroCount = 0;
        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] != 0){
                nonZeroCount++;
            }
        }
        int[] result = new int[numbers.length];
        int resultIndex = 0;
        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] != 0){
                result[resultIndex] = numbers[index];
                resultIndex++;
            }
        }
        for (int index = resultIndex; index < numbers.length; index++){
            result[index] = 0;
        }

        return result;
    }
}
