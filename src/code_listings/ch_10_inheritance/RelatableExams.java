package code_listings.ch_10_inheritance;

public class RelatableExams {

	public static void main(String[] args) {
		FinalExam3 exam1 = new FinalExam3(100, 20);
		
		FinalExam3 exam2 = new FinalExam3(100, 30);
		
		System.out.println("\nExam 1's score: " + exam1.getScore() + " - Exam 2's score: " + exam2.getScore());
		
		if(exam1.equals(exam2)) {
			System.out.println("\n-> exam 1's & exam 2's scores are equal");
		}else if(exam1.isGreater(exam2)) {
			System.out.println("\n-> exam 1's score is greater than exam 2's score");
		}else if(exam1.isLess(exam2)) {
			System.out.println("\n-> exam 1's score is less than exam 2's score");
		}
	}

}
