package code_listings.ch_10_inheritance;

public class FinalExam3 extends GradedActivity implements Relatable {
	private int numberOfQuestions, questionsMissed;
	
	private double pointsPerQuestion;

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
	 * @param numberOfQuestions
	 * @param questionsMissed
	 */
	public FinalExam3(int numberOfQuestions, int questionsMissed) {
		this.numberOfQuestions = numberOfQuestions;
		
		this.questionsMissed = questionsMissed;
		
		this.pointsPerQuestion = 100.0 / this.numberOfQuestions;
		
		double numericScore = 100.0 - (this.pointsPerQuestion * this.questionsMissed);
		
		setScore(numericScore); // GradedActivity.java's setScore()
	}
	
	/**
	 * @return true if the calling object's score is equal to the argument object's score
	 */
	@Override
	public boolean equals(GradedActivity grade) {
		if(this.getScore() == grade.getScore()) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * @return true if the calling object's score is greater than the argument object's score
	 */
	@Override
	public boolean isGreater(GradedActivity grade) {
		if(this.getScore() > grade.getScore()) {
			return true;
		}
		
		return false;
	}
	
	/**
	 * @return true if the calling object's score is less than the argument object's score
	 */
	@Override
	public boolean isLess(GradedActivity grade) {
		if(this.getScore() < grade.getScore()) {
			return true;
		}
		
		return false;
	}
	
	
}
