package challenges.ch10;

import java.util.Random;

import code_listings.ch_10_inheritance.FinalExam;
import code_listings.ch_10_inheritance.GradedActivity;
import code_listings.ch_10_inheritance.PassFailExam;

public class CourseGradesTester_5 {

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
		
		CourseGrades_5 grades = new CourseGrades_5();
		
		grades.setLab(lab);
		
		grades.setPassFailExam(pFExam);
		
		grades.setEssay(essay);
		
		grades.setFinalExam(fExam);
		
		System.out.println(grades);
	}

}
