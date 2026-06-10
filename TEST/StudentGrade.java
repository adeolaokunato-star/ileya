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
    public static int getsTheHighestInASubject(int[][] scores, int subject){
        int highest = 0;
        for(int count = 0; count < scores.length; count++){
            if(scores[count][subject] > highest){
                highest = scores[count][subject];
            }
        }
    return highest;
    }
    public static int getsTheLowestInASubject(int[][] scores, int subject){
        int lowest = scores[0][subject];
        for(int count = 0; count < scores.length; count++){
            if(scores[count][subject] < lowest){
                lowest = scores[count][subject];
            }
        }   
    return lowest;
    }
    public static int getSubjectTotal(int[][] scores, int subject){
        int totals = 0;
        for(int count = 0; count < scores.length; count++){
            totals = totals + scores[count][subject];
        }
    
        return totals;
    }
    public static void main(String[] args){
        System.out.println("========================================");
        System.out.println("========================================");
        System.out.println("========== YOMI SCHOOL GRADING =========");
        System.out.println("========================================");
        System.out.println("========================================");
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
                while (score < 0 || score > 100){
                    System.out.println("Entering score for student " + (index + 1));
                    System.out.println("Enter score for subject " + (count + 1));
                    score = inputCollector.nextInt();
                    if (score < 0 || score > 100) {
                        System.out.println("Invalid score is around 0-100.");
                    }
                }
                scores[index][count] = score;
                System.out.println("Saving >>>>>>>>>>>>>>>>>>>>");
                System.out.println("Saved successfully");
            }
        }
        int[] totals = new int[numStudents];
        for(int count = 0; count < numStudents; count++){
            totals[count] = StudentGrade.calculateTotal(scores[count]);          
        }
        System.out.println("==================================================");
        System.out.print("STUDENT     ");
        for (int index = 0; index < numSubjects; index++){
            System.out.print("SUB" + (index + 1) + "  ");
        }
        System.out.println("  TOT   AVE  POS");
        System.out.println("==================================================");
        for (int index = 0; index < numStudents; index++){
            int total = totals[index];
            int average = total / numSubjects;
            int position = StudentGrade.calculatePosition(totals, index);
            System.out.print("Student " + (index + 1) + "   ");
            for (int count = 0; count < numSubjects; count++) {
                System.out.print(scores[index][count] + "     ");
            }
            System.out.println(total + "   " + average + "   " + position);
        }
        System.out.println("==================================================");
        System.out.println();
        System.out.println("==================================================");
        System.out.println();
        System.out.println("SUBJECT SUMMARY");
         for (int count = 0; count < numSubjects; count++){
            System.out.println("Subject " + (count + 1));
            System.out.println("Highest score : " + StudentGrade.getsTheHighestInASubject(scores, count));
            System.out.println("Lowest score  : " + StudentGrade.getsTheLowestInASubject(scores, count));
            System.out.println("Total score   : " + StudentGrade.getSubjectTotal(scores, count));
            System.out.println("Average score : " + StudentGrade.getSubjectTotal(scores, count) / numStudents);
            System.out.println("Number of passes: " + StudentGrade.studentsPassed(scores, count));
            System.out.println("Number of fails : " + StudentGrade.studentsFailed(scores, count));
}
        int classTotal = 0;
        for(int index = 0; index < totals.length; index++){
            classTotal = classTotal + totals[index];
        }
        int classAverage = classTotal / numStudents;
        int best = 0;
        int worst =0;
        for(int index = 1; index < numStudents; index++){
            if(totals[index] > totals[best]){
                best = index;
            }
            if(totals[index] < totals[worst]){
                worst = index;
            }
        }
        System.out.println("============================================");
        System.out.println("======== YOMI CLASS SUMMARY ========");
//        System.out.println("============================================");
        System.out.println();
        System.out.println("Best Graduating Student  : Student " + (best + 1) + " scoring " + totals[best]);
        System.out.println("============================================");
        System.out.println();
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Worst Graduating Student : Student " + (worst + 1) + " scoring " + totals[worst]);
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println();
        System.out.println("==================================================");
        System.out.println("Class total score is     : " + classTotal);
        System.out.println("Class average score is   : " + classAverage);
        System.out.println("==================================================");
    }
}
