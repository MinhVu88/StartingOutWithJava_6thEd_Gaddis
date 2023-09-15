package code_listings.ch_08_a_2nd_look_at_classes_and_objects;
import code_listings.ch_06_a_1st_look_at_classes.Rectangle;

// this program passes a reference to an object as an argument to a method which is then able to change the object's contents

public class PassObject2 {

	public static void main(String[] args) {
		// create an instance of the Rectangle class, reference by variable box
		Rectangle box = new Rectangle(51.7, 23.6);
		
		System.out.println("\nthe instance's contents before its reference is passed to the method as an argument:");
		
		System.out.println("\n\tlength: " + box.getLength() + " & width: " + box.getWidth());
		
		// pass the object reference to the method as an argument
		changeRectangle(box);
		
		System.out.println("\nthe instance's modified contents after its reference was passed to the method as an argument:");
		
		System.out.println("\n\tlength: " + box.getLength() + " & width: " + box.getWidth());
	}
	
	public static void changeRectangle(Rectangle rec) {
		rec.setLength(14.2);
		
		rec.setWidth(47.8);
	}
}
