package CodeListings.Chapter8A2ndLookAtClassesAndObjects;

// This program demonstrates the Countable class

public class StaticDemo {

	public static void main(String[] args) {
		// create 3 instances of the Countable class
		Countable obj1 = new Countable();
		
		Countable obj2 = new Countable();
		
		Countable obj3 = new Countable();
		
		int numberOfInstances = obj1.getInstanceCount();
		
		System.out.println("\n" + numberOfInstances + " instances of the Countable class were created");
	}

}
