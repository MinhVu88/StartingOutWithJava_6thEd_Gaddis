package CodeListings.Chapter10Inheritance;

public interface Displayable {
	void display();
	
	default void defaultDisplay() {System.out.println("\nA default display method");};
}
