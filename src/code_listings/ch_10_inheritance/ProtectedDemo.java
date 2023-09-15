package code_listings.ch_10_inheritance;

import javax.swing.JOptionPane;

// This program demonstrates FinalExam2.java, which extends GradedActivity2.java

public class ProtectedDemo {

	public static void main(String[] args) {
		int numberOfQuestions = Integer.parseInt(JOptionPane.showInputDialog("the number of questions:"));
		
		int questionsMissed = Integer.parseInt(JOptionPane.showInputDialog("the number of missed questions:"));
		
		FinalExam2 exam = new FinalExam2(numberOfQuestions, questionsMissed);
		
		exam.display();
		
		System.exit(0);
	}

}
