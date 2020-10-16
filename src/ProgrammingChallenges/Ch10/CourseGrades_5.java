package ProgrammingChallenges.Ch10;

import CodeListings.Chapter10Inheritance.FinalExam;
import CodeListings.Chapter10Inheritance.PassFailExam;
import CodeListings.Chapter10Inheritance.GradedActivity;

/*
- In a course, a teacher gives the following tests & assignments:

	• A lab activity that is observed by the teacher & assigned a numeric score

	• A pass/fail exam that has 10 questions & the minimum passing score is 70

	• An essay that is assigned a numeric score

	• A final exam that has 50 questions

- Write a class named CourseGrades, which should have a GradedActivity array named grades as a field 

- The array should have 4 elements, one for each of the assignments previously described 

- The class should have the following methods:

* setLab: This method should accept a GradedActivity object as its argument

	+ This object should already hold the student’s score for the lab activity 
	
	+ Element 0 of the grades field should reference this object

* setPassFailExam: This method should accept a PassFailExam object as its argument

	+ This object should already hold the student’s score for the pass/fail exam 
	
	+ Element 1 of the grades field should reference this object

* setEssay: This method should accept an Essay object as its argument (use the Essay class or a GradedActivity object) 

	+ This object should already hold the student’s score for the essay 
	
	+ Element 2 of the grades field should reference this object

* setFinalExam: This method should accept a FinalExam object as its argument

	+ This object should already hold the student’s score for the final exam 
	
	+ Element 3 of the grades field should reference this object

* toString: This method should return a string that contains the numeric scores & grades for each element in the grades array

- Demonstrate the class in a program
*/

public class CourseGrades_5 {
	private GradedActivity[] grades = new GradedActivity[4];
	
	// a no-arg constructor
	public CourseGrades_5() {}	
	
	/**
	 * @param grades
	 */
	public CourseGrades_5(GradedActivity[] grades) {
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
	
	
}
