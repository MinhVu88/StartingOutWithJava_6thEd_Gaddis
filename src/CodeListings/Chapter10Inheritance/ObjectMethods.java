package CodeListings.Chapter10Inheritance;

// This program demonstrates the toString & equals methods that are inherited from the Object class

public class ObjectMethods {

	public static void main(String[] args) {
		PassFailExam exam1 = new PassFailExam();
		
		PassFailExam exam2 = new PassFailExam();
		
		// passing exam1 & exam2 to println() causes the Object class's toString method to return a reference to a string
		// containing the objects' class name, followed by the @ sign, followed by the object’s hash code, which is a hexadecimal number
		System.out.println("\nexam1: " + exam1);
		
		System.out.println("\nexam2: " + exam2);
		
		// The Object class's equals method accepts a reference to an object as its argument 
		// It returns true if the argument references the calling object
		if(exam1.equals(exam2)) {
			System.out.println("\nexam1 & exam2 are equal");
		}else {
			System.out.println("\nexam1 & exam2 are not equal");
		}
	}

}
