package code_listings.ch_06_a_1st_look_at_classes;

// This program demonstrates the Rectangle class's setLength, setWidth, getLength, getWidth & getArea methods

public class RectangleDemo {
	public static void main(String[] args) {
		Rectangle box = new Rectangle();
		
		box.setLength(10.0);
		box.setWidth(20.0);
		
		System.out.println("\nthe box's length: " + box.getLength() + " - the box's width: " + box.getWidth() + " - the box's area: " + box.getArea());
	}
}
