package CodeListings.Chapter6AFirstLookAtClasses;

// This program demonstrates the Rectangle class's setLength() method

public class LengthDemo {
	public static void main(String[] args) {
		Rectangle box = new Rectangle(); // create an instance of the Rectangle class & assign its memory address to the box variable
		
		System.out.println("sending the value 10.0 to the setLength() method");
		
		box.setLength(10.0); // call the setLength() method of the Rectangle class's instance, box
		
		System.out.println("done");
	}
	
	
}
