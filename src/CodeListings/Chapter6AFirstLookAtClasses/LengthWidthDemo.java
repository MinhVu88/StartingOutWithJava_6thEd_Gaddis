package CodeListings.Chapter6AFirstLookAtClasses;

// This program demonstrates the Rectangle class's setLength, setWidth, getLength & getWidth methods

public class LengthWidthDemo {
	public static void main(String[] args) {
		Rectangle box = new Rectangle();
		
		// call the setLength & setWidth methods of the Rectangle class's box object & pass 10.0 & 20.0 as arguments 
		box.setLength(10.0);
		box.setWidth(20.0);
		
		System.out.println("\nthe box's length: " + box.getLength() + " - " + "the box's width: " + box.getWidth());
	}
}
