public class TaskOne{
    public static int[] sorting(int[] numbersOne, int[] numbersTwo){
        int[] combined = new int[numbersOne.length + numbersTwo.length];
        int resultIndex = 0;
        for (int index = 0; index < numbersOne.length; index++){
            combined[resultIndex] = numbersOne[index];
            resultIndex++;
        }
        for (int index = 0; index < numbersTwo.length; index++){
            combined[resultIndex] = numbersTwo[index];
            resultIndex++;
        }
        for (int index = 0; index < combined.length; index++){
            for (int count = 0; count < combined.length - index - 1; count++){
                if (combined[count] > combined[j + 1]) {
                    int temp       = combined[count];
                    combined[count]    = combined[count + 1];
                    combined[count + 1] = temp;
                }
            }
        }
        return combined;
    }
}
