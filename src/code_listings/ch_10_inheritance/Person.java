package code_listings.ch_10_inheritance;

// This class implements the Displayable interface but doesn't override the default display method

public class Person implements Displayable {
	private String name;
	
	/**
	 * @param name
	 */
	public Person(String name) {
		this.name = name;
	}
		
	@Override
	public void display() {
		System.out.println("\nMy name: " + this.name);
	}
	
}
