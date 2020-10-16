package CodeListings.Chapter10Inheritance;

// This program demonstrates CompSciStudent.java

public class CompSciStudentDemo {

	public static void main(String[] args) {
		CompSciStudent csStu = new CompSciStudent ("Paul Allen", "007", 1976);
		
		csStu.setMathHours(12);
		
		csStu.setCompsciHours(20);
		
		csStu.setGeneralEduHours(40);
		
		System.out.println(csStu);
		
		System.out.println("\nThe remaining hours: " + csStu.getRemainingHours());
	}

}
