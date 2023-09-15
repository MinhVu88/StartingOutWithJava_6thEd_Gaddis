package challenges.ch10;

import code_listings.ch_10_inheritance.FinalExam;
import code_listings.ch_10_inheritance.GradedActivity;
import code_listings.ch_10_inheritance.PassFailExam;

/*
- this class implements the Analyzable interface

- The getAverage method should return the average of the numeric scores stored in the grades array 

- The getHighest method should return a reference to the element of the grades array that has the highest numeric score 

- The getLowest method should return a reference to the element of the grades array that has the lowest numeric score 

- Demonstrate the new methods in a complete program
*/

public class CourseGrades_6 implements Analyzable {
	private GradedActivity[] grades = new GradedActivity[4];
	
	// a no-arg constructor
	public CourseGrades_6() {}	
	
	/**
	 * @param grades
	 */
	public CourseGrades_6(GradedActivity[] grades) {
		this.grades = grades;
	}	

	/**
	 * @return the grades
	 */
	public GradedActivity[] getGrades() {
		return grades;
	}

	/**
	 * @param grades the grades to set
	 */
	public void setGrades(GradedActivity[] grades) {
		this.grades = grades;
	}

	public void setLab(GradedActivity labGrade) {
		this.grades[0] = labGrade;
	}
	
	public void setPassFailExam(PassFailExam pFExam) {
		this.grades[1] = pFExam;
	}
	
	public void setEssay(Essay essay) {
		this.grades[2] = essay;
	}
	
	public void setFinalExam(FinalExam fExam) {
		this.grades[3] = fExam;
	}

	@Override
	public String toString() {
		return "\n* Lab numeric score: " + this.grades[0].getScore() + " - Lab letter grade: " + this.grades[0].getGrades() +
				"\n\n* Pass/Fail exam numeric score: " + this.grades[1].getScore() + " - Pass/Fail letter grade: " + this.grades[1].getGrades() +
				"\n\n* Essay numeric score: " + this.grades[2].getScore() + " - Essay letter grade: " + this.grades[2].getGrades() +
				"\n\n* Final exam numeric score: " + this.grades[3].getScore() + " - Final exam letter grade: " + this.grades[3].getGrades();
	}

	@Override
	public double getAverage() {
		return (this.grades[0].getScore() + this.grades[1].getScore() + this.grades[2].getScore() + this.grades[3].getScore()) / this.grades.length;
	}

	@Override
	public GradedActivity getHighest() {
		double max = this.grades[0].getScore();
		
		GradedActivity highest = new GradedActivity();
		
		for(int index = 0; index < this.grades.length; index++) {
			if(max < this.grades[index].getScore()) {
				max = this.grades[index].getScore();
				
				highest.setScore(this.grades[index].getScore());
			}
		}
		return highest;
	}

	@Override
	public GradedActivity getLowest() {
		double min = this.grades[0].getScore();
		
		GradedActivity lowest = new GradedActivity();
		
		for(int index = 0; index < this.grades.length; index++) {
			if(min > this.grades[index].getScore()) {
				min = this.grades[index].getScore();
				
				lowest.setScore(this.grades[index].getScore());
			}
		}
		
		return lowest;
	}
	
	
}
