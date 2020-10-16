package CodeListings.Chapter10Inheritance;

import javax.swing.JOptionPane;

// a modification of FinalExam.java 

public class FinalExam2 extends GradedActivity2 {
	private int numberOfQuestions, questionsMissed;
	
	private double pointsPerQuestion;

	/**
	 * @param numberOfQuestions
	 * @param questionsMissed
	 */
	public FinalExam2(int numberOfQuestions, int questionsMissed) {
		this.numberOfQuestions = numberOfQuestions;
		
		this.questionsMissed = questionsMissed;
		
		this.pointsPerQuestion = 100.0 / this.numberOfQuestions;
		
		double numericScore = 100.0 - (this.questionsMissed * this.pointsPerQuestion);
		
		setScore(numericScore); // this method is inherited from GradedActivity2.java
		
		adjustScore();
	}

	/**
	 * @return the numberOfQuestions
	 */
	public int getNumberOfQuestions() {
		return numberOfQuestions;
	}

	/**
	 * @param numberOfQuestions the numberOfQuestions to set
	 */
	public void setNumberOfQuestions(int numberOfQuestions) {
		this.numberOfQuestions = numberOfQuestions;
	}

	/**
	 * @return the questionsMissed
	 */
	public int getQuestionsMissed() {
		return questionsMissed;
	}

	/**
	 * @param questionsMissed the questionsMissed to set
	 */
	public void setQuestionsMissed(int questionsMissed) {
		this.questionsMissed = questionsMissed;
	}

	/**
	 * @return the pointsPerQuestion
	 */
	public double getPointsPerQuestion() {
		return pointsPerQuestion;
	}

	/**
	 * @param pointsPerQuestion the pointsPerQuestion to set
	 */
	public void setPointsPerQuestion(double pointsPerQuestion) {
		this.pointsPerQuestion = pointsPerQuestion;
	}
	
	/**
	 * this method directly accesses GradedActivity2’s protected score field
	 * 
	 * If the contents of score have a fractional part of 0.5 or greater, the method rounds up score to the next whole number
	 * 
	 * The method is called from the constructor
	 */
	public void adjustScore() {
		double fraction = score - (int)score; // Get the fractional part of the score
		
		if(fraction >= 0.5) {
			score = (double)Math.round(score);
		}
	}
	
	public void display() {
		JOptionPane.showMessageDialog(null, "Each quesion's points: " + getPointsPerQuestion() + " points. "
											+ "\nThe score: " + getScore()
											+ "\nThe letter grade: " + getGrades());
	}
}
