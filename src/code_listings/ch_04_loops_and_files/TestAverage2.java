package code_listings.ch_04_loops_and_files;
import javax.swing.JOptionPane;

/* general description:

 
 - this program is used to get the average of each student's test scores
 - the user enters the number of students & the number of tests each student takes
 - the outer loop iterates once for each student
 - after each iteration of the outer loop, the nested inner loop iterates once for each test score
 - then the average score of each student's total test scores is calculated
*/

/* the ipo:

- input: number of students, number of tests per student, scores per test 
- process: calculate each student's total scores & average score
- output: each student's average score
*/

/* pseudocode:

- declare int var(s): numberOfStudents, testsPerStudent, scoresPerTest, totalScores
- declare real var(s): averageScore
- display "the number of students: "
- input numberOfStudents
- display "the number of tests per student: "
- input testsPerStudent
- for student = 1 to numberOfStudents:
	+ set totalScores = 0
	+ display "student number: ", student
		- for test = 1 to testsPerStudent:
			+ display "test number ", test
			+ add scoresPerTest to totalScores
	+ display "total score: ", totalScores
	+ set averageScore = totalScores / testsPerStudent
	+ display "average score: ", averageScore
*/

public class TestAverage2 {
	public static void main(String[] args) {
		int numberOfStudents, testsPerStudent, scoresPerTest, totalScores; // totalScores is the accumulator
		double averageScore;
		
		numberOfStudents = Integer.parseInt(JOptionPane.showInputDialog("the number of students:"));
		
		testsPerStudent = Integer.parseInt(JOptionPane.showInputDialog("the number of tests per student:"));
		
		for(int student = 1; student <= numberOfStudents; student++) {
			totalScores = 0;
			JOptionPane.showMessageDialog(null, "student number " + student + ":");
			
			for(int test = 1; test <= testsPerStudent; test++) {
				scoresPerTest = Integer.parseInt(JOptionPane.showInputDialog("test number " + test + ":"));
				totalScores += scoresPerTest;
			}
			
			JOptionPane.showMessageDialog(null, "total score: " + totalScores);
			
			averageScore = (double) totalScores / testsPerStudent;
			
			JOptionPane.showMessageDialog(null, "average score: " + averageScore);
		}
		System.exit(0);
	}
}
