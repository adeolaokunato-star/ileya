public class TaskOne{
    public static int[] evenNumbers(int[] numbers){
        int evenCount = 0;
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] % 2 == 0){
                evenCount++;
            }
        }
        int[] evenNumbers = new int[evenCount];
        int evenIndex = 0;
        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] % 2 == 0) {
                evenNumbers[evenIndex] = numbers[index];
                evenIndex++;
            }
        }
        return evenNumbers;
    }
    public static int[] oddNumbers(int[] numbers){
        int oddCount = 0;
        for (int count = 0; count < numbers.length; count++){
            if (numbers[count] % 2 != 0){
                oddCount++;
            }
        }
        int[] oddNumbers = new int[oddCount];
        int oddIndex = 0;
        for (int index = 0; index < numbers.length; index++){
            if (numbers[index] % 2 != 0){
                oddNumbers[oddIndex] = numbers[i];
                oddIndex++;
            }
        }
        return oddNumbers;
    }
}
