package code_listings.ch_10_inheritance;

import code_listings.ch_06_a_1st_look_at_classes.Rectangle;

public class Polymorphic {

	public static void main(String[] args) {
		// declare & create a GradedActivity-type array in which each element is a reference to an instance of the GradedActivity class
		GradedActivity[] tests = new GradedActivity[3];
		
		// the 1st element references a GradedActivity instance
		tests[0] = new GradedActivity();
		
		tests[0].setScore(88);
		
		// the 2nd element is assigned a reference to a PassFailExam instance
		tests[1] = new PassFailExam(100, 25, 60);
		
		// the 3rd element is assigned a reference a FinalExam instance
		tests[2] = new FinalExam(50, 7);
		
		for(int index = 0; index < tests.length; index++) {
			System.out.println("\ntest #" + (index + 1) + ": \n-> score: " + tests[index].getScore() + "\n-> grade: " + tests[index].getGrades());
		}
		
		// the instanceof operator
		Cube cube = new Cube();
		
		if(cube instanceof Rectangle) {
			System.out.println("\n\t=> cube is an instance of the Rectangle class");
		}else {
			System.out.println("\n\t=> cube is not an instance of the Rectangle class");
		}
	}

}
