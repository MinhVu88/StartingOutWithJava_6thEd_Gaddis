package CodeListings.Chapter10Inheritance;
import javax.swing.JOptionPane;

// this program demonstrates FinalExam.java, which extends GradedActivity.java

public class FinalExamDemo {

	public static void main(String[] args) {
		int numberOfQuestions = Integer.parseInt(JOptionPane.showInputDialog("the number of questions:"));
		
		int questionsMissed = Integer.parseInt(JOptionPane.showInputDialog("the number of missed questions:"));
		
		FinalExam exam = new FinalExam(numberOfQuestions, questionsMissed);
		
		/*
		// getScore() & getGrades() of the GradedActivity class are called directly from the FinalExam instance, exam
		JOptionPane.showMessageDialog(null, "Each question's point: " + exam.getPointsPerQuestion() + 
											" points. \nThe score: " + exam.getScore() 
											+ "\nThe grade: " + exam.getGrades());
		*/
		
		exam.display();
		
		System.exit(0);
	}

}
