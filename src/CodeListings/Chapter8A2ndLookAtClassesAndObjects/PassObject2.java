package CodeListings.Chapter8A2ndLookAtClassesAndObjects;
import CodeListings.Chapter6AFirstLookAtClasses.Rectangle;

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
