package code_listings.ch_10_inheritance;

import java.util.Scanner;

public class PassFailExamDemo {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		System.out.print("\nthe number of questions: ");
		
		int numberOfQuestions = kbi.nextInt();
		
		System.out.print("\nthe number of missed questions: ");
		
		int missedQuestions = kbi.nextInt();
		
		System.out.print("\nthe minimum score to pass the exam: ");
		
		double minPassingScore = kbi.nextDouble();
		
		PassFailExam exam = new PassFailExam(numberOfQuestions, missedQuestions, minPassingScore);
		
		exam.display();
		
		kbi.close();
	}
}
