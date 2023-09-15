package code_listings.ch_10_inheritance;

import javax.swing.JOptionPane;

public class FinalExam extends GradedActivity {
	private int numberOfQuestions, questionsMissed;
	
	private double pointsPerQuestion;
	
	// a no-arg constructor
	public FinalExam() {}
	
	/**
	 * @param numberOfQuestions
	 * @param questionsMissed
	 */
	public FinalExam(int numberOfQuestions, int questionsMissed) {
		this.numberOfQuestions = numberOfQuestions;
		
		this.questionsMissed = questionsMissed;
		
		this.pointsPerQuestion = 100.0 / this.numberOfQuestions;
		
		double numericScore = 100.0 - (this.questionsMissed * this.pointsPerQuestion);
		
		setScore(numericScore); // this method is inherited from GradedActivity.java
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
	
	public void display() {
		JOptionPane.showMessageDialog(null, "Each quesion's points: " + getPointsPerQuestion() + " points. "
											+ "\nThe score: " + getScore()
											+ "\nThe letter grade: " + getGrades());
	}
}
