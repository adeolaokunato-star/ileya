public class TaskTwo{
  public static int[] replaceNonPerfectSquares(int[] numbers){
    int[] result = new int[numbers.length];
    for(int count = 0; count < numbers.length; count++){
        int squareRoot = 0;
        for(int index = 1; index * index <= numbers[count]; index++){
            squareRoot = index;
        }
        if(squareRoot * squareRoot == numbers[count]){
            result[count] = numbers[count]; 
        } else{
            result[count] = -1;   
        }
    }
    return result;
  }
}
