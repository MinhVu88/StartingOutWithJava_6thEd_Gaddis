package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

// This program demonstrates the Course class

public class CourseDemo {

	public static void main(String[] args) {
		// create an instance of the Instructor class
		Instructor myInstructor = new Instructor("Nathan", "Schutz", "RH3010");
		
		// create an instance of the TextBook class
		TextBook myTextbook = new TextBook("Starting out with Java 6th Ed", "Tony Gaddis", "Pearson");
		
		// create an instance of the Course class, which is an aggregate object as it contains references to instances of other classes
		Course myCourse = new Course("computer science", myInstructor, myTextbook);
		
		// display the course info by using the toString method
		System.out.println(myCourse);
	}

}
