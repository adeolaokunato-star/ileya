public class TaskEight {
    public static int[] mergeSorted(int[] numbersOne, int[] numbersTwo) {
        int[] combined = new int[numbersOne.length + numbersTwo.length];
        int resultIndex = 0;
        for (int index = 0; index < numbersOne.length; index++) {
            combined[resultIndex] = numbersOne[index];
            resultIndex++;
        }
        for (int index = 0; index < numbersTwo.length; index++) {
            combined[resultIndex] = numbersTwo[index];
            resultIndex++;
        }
 
        for (int index = 0; index < combined.length; index++) {
            for (int j = 0; j < combined.length - index - 1; j++) {
                if (combined[j] > combined[j + 1]) {
                    int temp       = combined[j];
                    combined[j]    = combined[j + 1];
                    combined[j + 1] = temp;
                }
            }
        }
        return combined;
    }
}
