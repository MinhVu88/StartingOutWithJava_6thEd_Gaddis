package code_listings.ch_08_a_2nd_look_at_classes_and_objects;

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
