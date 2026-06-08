import java.util.Scanner;
public class StudentGrade{
    public static int calculateTotal(int[] scores){
        int total = 0;
        for(int index = 0; index < scores.length; index++){
            total = total + scores[index];
        }       
        return total;
    }
    public static int calculatePosition(int[] totals, int studentIndex){
        int position = 1;
        for(int count = 0; count < totals.length; count++){
            if(totals[count] > totals[studentIndex])
            position++;
        }
        return position;
    }
    public static int studentsFailed(int[][] scores, int subject){
        int fails = 0;
        for (int count = 0; count < scores.length; count++){
            if (scores[count][subject] < 50){
            fails++;
            }
        }
        return fails;
    } 
    public static int studentsPassed(int[][] scores, int subject){
        int passes = 0;
        for (int count = 0; count < scores.length; count++){
            if (scores[count][subject] >= 50){
            passes++;
            }
        }
        return passes;
    } 
    public static void main(String[] args){
        Scanner inputCollector = new Scanner(System.in);
        System.out.print("how many students do you have?: ");
        int numStudents = inputCollector.nextInt();
        System.out.print("How many subjects do they offer?: ");
        int numSubjects = inputCollector.nextInt();
        System.out.println("Saving >>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println("Saved successfully");
        int[][] scores = new int[numStudents][numSubjects];
        for (int index = 0; index < numStudents; index++){
            for (int count = 0; count < numSubjects; count++){
                int score = -1;
                while (score < 0 || score > 100) {
                    System.out.println("Entering score for student " + (index + 1));
                    System.out.println("Enter score for subject " + (count + 1));
                    score = scanner.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid! Score must be between 0 and 100.");
                    }
                }
                scores[index][count] = score;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
            }
        }
    }
















}
