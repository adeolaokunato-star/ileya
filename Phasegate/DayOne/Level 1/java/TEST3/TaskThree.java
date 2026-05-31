public class TaskThree{
  public static int[] perfectSquares(int[] numbers){
    int perfectCount = 0;
    for (int index = 0; index < numbers.length; index++){
        int squareRoot = 0;
        for (int count = 1; count * count <= numbers[index]; count++){
            squareRoot = count;
        }
        if (squareRoot * squareRoot == numbers[index]){
            perfectCount++;
        }
    }
    int[] result = new int[perfectCount];
    int resultIndex = 0;                              
    for (int index = 0; index < numbers.length; index++){
        int squareRoot = 0;
        for (int count = 1; count * count <= numbers[index]; count++){
            squareRoot = count;
        }
        if (squareRoot * squareRoot == numbers[index]){
            result[resultIndex] = numbers[index];     
            resultIndex++;                            
        }
    }
    return result;
  }
}
