package ProgrammingChallenges.Ch10;

import java.util.Random;

import CodeListings.Chapter10Inheritance.FinalExam;
import CodeListings.Chapter10Inheritance.GradedActivity;
import CodeListings.Chapter10Inheritance.PassFailExam;

public class CourseGradesTester_6 {

	public static void main(String[] args) {
		Random randomNo = new Random();
		
		GradedActivity lab = new GradedActivity();
		
		// A pass/fail exam that has 10 questions & the minimum passing score is 70
		PassFailExam pFExam = new PassFailExam(10, randomNo.nextInt(11), 70);
		
		Essay essay = new Essay();
		
		// A final exam that has 50 questions
		FinalExam fExam = new FinalExam(50, randomNo.nextInt(51));
		
		lab.setScore(randomNo.nextInt(101));
		
		essay.setScore(randomNo.nextInt(101));
		
		CourseGrades_6 grades = new CourseGrades_6();
		
		grades.setLab(lab);
		
		grades.setPassFailExam(pFExam);
		
		grades.setEssay(essay);
		
		grades.setFinalExam(fExam);
		
		System.out.println(grades);
		
		System.out.println("\n* The average score: " + grades.getAverage());
		
		System.out.println("\n* The highest numeric score & letter grade: " + grades.getHighest().getScore() + " - " + grades.getHighest().getGrades());
		
		System.out.println("\n* The lowest numeric score & letter grade: " + grades.getLowest().getScore() + " - " + grades.getLowest().getGrades());
	}

}
