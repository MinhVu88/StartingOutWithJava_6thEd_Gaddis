package CodeListings.Chapter6AFirstLookAtClasses;

// phases 1 + 2 + 3 + 4 under construction

public class Rectangle {
	private double length, width; // fields
	
	/**
	 * constructor 1 (ConstructorDemo.java)
	 * 
	 * @param l the length
	 * @param w the width
	 */
	public Rectangle(double l, double w) {
		length = l;
		width = w;
	}
	
	// a no-arg constructor
	public Rectangle() {
		length = 0.0;
		width = 0.0;
	}
	
	// the setLength() method stores a value in the length field
	public void setLength(double len) {
		length = len;
	}
	
	// the setWidth() method stores a value in the width field
	public void setWidth(double wid) {
		width = wid;
	}
	
	// the getLength() returns a Rectangle instance's length
	public double getLength() {
		return length;
	}
	
	// the getWidth() method returns a Rectangle instance's width
	public double getWidth() {
		return width;
	}
	
	// the getArea() method returns a Rectangle instance's area
	public double getArea() {
		return length * width;
	}
}
