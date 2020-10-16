package CodeListings.Chapter10Inheritance;
import CodeListings.Chapter6AFirstLookAtClasses.Rectangle;

public class Cube extends Rectangle {
	private double height;

	/**
	 * @return the height
	 */
	public double getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(double height) {
		this.height = height;
	}
	
	public Cube() {}
	
	/**
	 * @param length the cube's length
	 * @param width the cube's width
	 * @param height the cube's height
	 */
	public Cube(double length, double width, double height) {
		super(length, width); // the superclass constructor is called 1st (the Rectangle class's constructor)
		
		this.height = height;
	}

	public double getSurfaceArea() {
		return getArea() * 6; // the superclass's getArea() is called
	}
	
	public double getVolume() {
		return getArea() * this.height;
	}
	
	public void display() {
		System.out.println("\n-> the cube's length: " + this.getLength());
		
		System.out.println("\n-> the cube's width: " + this.getWidth());
		
		System.out.println("\n-> the cube's height: " + this.height);
		
		System.out.println("\n-> the cube's base area: " + this.getArea());
		
		System.out.println("\n-> the cube's surface area: " + this.getSurfaceArea());
		
		System.out.println("\n-> the cube's volume: " + this.getVolume());
	}
}
