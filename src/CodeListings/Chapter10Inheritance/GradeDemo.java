package CodeListings.Chapter10Inheritance;
import javax.swing.JOptionPane;

// This program demonstrates GradedActivity.java

public class GradeDemo {

	public static void main(String[] args) {
		GradedActivity grade = new GradedActivity();
		
		double score = Double.parseDouble(JOptionPane.showInputDialog("enter a numeric score:"));
		
		grade.setScore(score);
		
		JOptionPane.showMessageDialog(null, "The grade for that test: " + grade.getGrades());
		
		System.exit(0);
		
	}

}
