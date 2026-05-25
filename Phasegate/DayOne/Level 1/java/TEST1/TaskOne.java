public class TaskOne{
  public static int [] seprateEvenandOdd(int [] numbers){
    int even = 0;
    int odd = 0;
    for(int count = 0; count < numbers.length; count++){
      if(numbers[count] % 2 == 0){
        even++;
      }
      else{
        odd++;
      }
    }
    int evenCount = new int[even];
    int oddCount = new int[odd];
    int eveCount = 0;
    int oddCount = 0;
    for(int index = 0; index < numbers.length; index++){
      if(numbers[index] % 2 == 0){
        even[evenCount] = numbers[index];
        evenCount++;
      }
      else{
        odd[oddCount] = numbers[index];
        oddCount++;
      }
    }
    reurn new int [][]{even,odd];
 }
}  
