package challenges.ch5;
import java.util.Scanner;

/*
- Write a program that asks the user to enter 5 test scores 

- The program should display a letter grade for each score and the average test score 

- Write the following methods in the program:

� calcAverage�This method should accept 5 test scores as arguments and return the average of the scores

� determineGrade�This method should accept a test score as an argument and return a letter grade for the score, based on the following grading scale:

Score 		Letter Grade

90�100 		A
80�89 		B
70�79 		C
60�69 		D
Below 60 	F
*/

public class C7PG313 {
	public static void main(String[] args) {
		Scanner kbi = new Scanner(System.in);
		
		double test1, test2, test3, test4, test5;
		
		System.out.print("score of test 1: ");
		test1 = kbi.nextDouble();
		
		System.out.println();
		
		System.out.print("score of test 2: ");
		test2 = kbi.nextDouble();
		
		System.out.println();
		
		System.out.print("score of test 3: ");
		test3 = kbi.nextDouble();
		
		System.out.println();
		
		System.out.print("score of test 4: ");
		test4 = kbi.nextDouble();
		
		System.out.println();
		
		System.out.print("score of test 5: ");
		test5 = kbi.nextDouble();
		
		System.out.println("\n\tthe average score: " + calcAverage(test1, test2, test3, test4, test5));
		
		System.out.println("\nScore           	 	Letter Grade");
		System.out.println("---------------------------------------------");
		System.out.println("test 1: " + test1 + "              	" + determineGradeTest1(test1));
		System.out.println("test 2: " + test2 + "              	" + determineGradeTest1(test2));
		System.out.println("test 3: " + test3 + "              	" + determineGradeTest1(test3));
		System.out.println("test 4: " + test4 + "              	" + determineGradeTest1(test4));
		System.out.println("test 5: " + test5 + "              	" + determineGradeTest1(test5));
		
		kbi.close();
	}
	
	public static double calcAverage(double t1, double t2, double t3, double t4, double t5) {
		double average = Math.round((t1 + t2 + t3 + t4 + t5) / 5.0);
		return average;
	}
	
	public static String determineGradeTest1(double t1) {
		String letterGrade = "";
		
		if(t1 < 60) {
			letterGrade = "F";
		}else if (t1 > 59 & t1 < 70) {
			letterGrade = "D";
		}else if (t1 > 69 & t1 < 80) {
			letterGrade = "C";
		}else if (t1 > 79 & t1 < 90) {
			letterGrade = "B";
		}else if (t1 > 89 & t1 < 101) {
			letterGrade = "A";
		}
		
		return letterGrade;
	}
	
	public static String determineGradeTest2(double t2) {
		String letterGrade = "";
		
		if(t2 < 60) {
			letterGrade = "F";
		}else if (t2 > 59 & t2 < 70) {
			letterGrade = "D";
		}else if (t2 > 69 & t2 < 80) {
			letterGrade = "C";
		}else if (t2 > 79 & t2 < 90) {
			letterGrade = "B";
		}else if (t2 > 89 & t2 < 101) {
			letterGrade = "A";
		}
		
		return letterGrade;
	}
	
	public static String determineGradeTest3(double t3) {
		String letterGrade = "";
		
		if(t3 < 60) {
			letterGrade = "F";
		}else if (t3 > 59 & t3 < 70) {
			letterGrade = "D";
		}else if (t3 > 69 & t3 < 80) {
			letterGrade = "C";
		}else if (t3 > 79 & t3 < 90) {
			letterGrade = "B";
		}else if (t3 > 89 & t3 < 101) {
			letterGrade = "A";
		}
		
		return letterGrade;
	}
	
	public static String determineGradeTest4(double t4) {
		String letterGrade = "";
		
		if(t4 < 60) {
			letterGrade = "F";
		}else if (t4 > 59 & t4 < 70) {
			letterGrade = "D";
		}else if (t4 > 69 & t4 < 80) {
			letterGrade = "C";
		}else if (t4 > 79 & t4 < 90) {
			letterGrade = "B";
		}else if (t4 > 89 & t4 < 101) {
			letterGrade = "A";
		}
		
		return letterGrade;
	}
	
	public static String determineGradeTest5(double t5) {
		String letterGrade = "";
		
		if(t5 < 60) {
			letterGrade = "F";
		}else if (t5 > 59 & t5 < 70) {
			letterGrade = "D";
		}else if (t5 > 69 & t5 < 80) {
			letterGrade = "C";
		}else if (t5 > 79 & t5 < 90) {
			letterGrade = "B";
		}else if (t5 > 89 & t5 < 101) {
			letterGrade = "A";
		}
		
		return letterGrade;
	}
}
