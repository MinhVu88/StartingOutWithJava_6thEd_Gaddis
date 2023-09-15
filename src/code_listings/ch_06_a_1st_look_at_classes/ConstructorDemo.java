package code_listings.ch_06_a_1st_look_at_classes;

public class ConstructorDemo {
	public static void main(String[] args) {
		Rectangle box = new Rectangle(4.7, 5.1);
		
		System.out.println("\nthe box's length: " + box.getLength() + " - the box's width: " + box.getWidth() + " - the box's area: " + box.getArea());
	}
}
