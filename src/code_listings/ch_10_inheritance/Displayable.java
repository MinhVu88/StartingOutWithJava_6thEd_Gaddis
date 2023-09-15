package code_listings.ch_10_inheritance;

public interface Displayable {
	void display();
	
	default void defaultDisplay() {System.out.println("\nA default display method");};
}
