/**
 * Purpose: Calculate the total points and average grade each time a new score is added to the total
 *
 * @author Richa Limaye
 * @version September 3, 2023
 *
 * public class GradesV3 {
 *     public static void main(String[ ] args) {
 *         int numTests = 0;       //counts number of tests
 *         int testGrade = 0;      //individual test grade
 *         int totalPoints = 0;    //total points for all tests
 *         double average = 0.0;   //average grade
 *
 *
 *         int test1 = testGrade = 95;         //first test points
 *         numTests++;                         //adds 1 to test number
 *         totalPoints = totalPoints + test1;
 *         average = (double) totalPoints / numTests;
 *         System.out.println("Test #1  Test Grade: " + test1 + "   Average Score: " + average);
 *
 *         int test2 = testGrade = 73;
 *         numTests++;
 *         totalPoints = totalPoints + test2;
 *         average = (double) totalPoints / numTests;
 *         System.out.println("Test #2  Test Grade: " + test2 + "   Average Score: " + average);
 *
 *         int test3 = testGrade = 91;
 *         numTests++;
 *         totalPoints = totalPoints + test3;
 *         average = (double) totalPoints / numTests;
 *         System.out.println("Test #3  Test Grade: " + test3 + "   Average Score: " + average);
 *
 *         int test4 = testGrade = 82;
 *         numTests++;
 *         totalPoints = totalPoints + test4;
 *         average = (double) totalPoints / numTests;
 *         System.out.println("Test #4  Test Grade: " + test4 + "   Average Score: " + average);
 *
 *         // additional outputs
 *
 *         int test5 = testGrade = 99;
 *         numTests++;
 *         totalPoints = totalPoints + test5;
 *         average = (double) totalPoints / numTests;
 *         System.out.println("Test #5  Test Grade: " + test5 + "   Average Score: " + average);
 *
 *         int test6 = testGrade = 85;
 *         numTests++;
 *         totalPoints = totalPoints + test6;
 *         average = (double) totalPoints / numTests;
 *         System.out.println("Test #2  Test Grade: " + test6 + "   Average Score: " + average);
 *
 *     }//end of main method
 * }//end of class
 */

public class GradesV3 {
    public static void main(String[] args) {
        int totalPoints = 0;    //total points for all tests
        double average = 0.0;   //average grade

        int[] testGrades = new int[]{95,73,91,82,99,85};

        for(int i = 0; i < testGrades.length; i++){
            totalPoints = totalPoints + testGrades[i];
            average = (double) totalPoints / (i + 1);
            System.out.println("Test #" + (i+1) + " Test Grade: " + testGrades[i] + "   Average Score: " + average);
        }
    }
}