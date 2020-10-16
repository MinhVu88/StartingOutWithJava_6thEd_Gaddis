package ProgrammingChallenges.Ch7;

import java.util.Scanner;

public class DriverExamTester {

	public static void main(String[] args) {
		final int QUESTION_QUANTITY = 20;
		
		String[] studentAnswers = new String[QUESTION_QUANTITY];
		
		display(studentAnswers);
	}
	
	private static void display(String[] stuAns) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.println("\n\t\tanswers can only be A, B, C or D");
		
		for(int index = 0; index < stuAns.length; index++) {
			System.out.print("\nquestion #" + (index + 1) + ": ");
			
			stuAns[index] = kbi.nextLine().toUpperCase();
			
			if(stuAns[index].charAt(0) != 'A' && stuAns[index].charAt(0) != 'B' && 
					stuAns[index].charAt(0) != 'C' && stuAns[index].charAt(0) != 'D' && Character.isWhitespace(stuAns[index].charAt(0))) {
				System.out.println("\n\twrong answer or an unanswered question");
			}
		}
		
		DriverExam ans = new DriverExam(stuAns);
		
		if(ans.passed()) {
			System.out.println("\n\tyou passed the exam");
		}else {
			System.out.println("\n\tyou failed the exam because the total number of correct answers are below 15");
		}
		
		System.out.println("\n\tthe total correct answers you got: " + ans.totalCorrect());
		
		System.out.println("\n\tthe total incorrect answers you got: " + ans.totalIncorrect());
		
		System.out.print("\n\tthe questions that you missed: ");
		
		for(int index = 0; index < ans.questionsMissed().length; index++) {
			System.out.print(" " + ans.questionsMissed()[index]);
		}
		
		kbi.close();
	}
}
