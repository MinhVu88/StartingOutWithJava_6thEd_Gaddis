package CodeListings.Chapter8A2ndLookAtClassesAndObjects;
import CodeListings.Chapter6AFirstLookAtClasses.Rectangle;

public class PassObject {

	public static void main(String[] args) {
		// create an instance of the Rectangle class, referenced by variable box
		Rectangle box = new Rectangle(12.5, 5.12);
		
		// pass a reference to the instance as an argument to the displayRectangle method
		// thus now both box & the method's parameter variable reference the same Rectangle object
		displayRectangle(box);
}
	/**
	 * this method has access to a Rectangle instance, referenced by box & rec
	 * therefore it can modify the object's contents
	 * @param rec a reference to the Rectangle object
	 */
	public static void displayRectangle(Rectangle rec) {
		System.out.println("\nlength: " + rec.getLength() + " & width: " + rec.getWidth());
	}
}
