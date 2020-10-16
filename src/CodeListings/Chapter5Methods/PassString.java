package CodeListings.Chapter5Methods;

// this program demonstrates that String arguments can't be changed

public class PassString {
	public static void main(String[] args) {
		String name = "Bill Hicks";
		
		System.out.println("\nin the main() method, the name variable is " + name);
		
		changeName(name); // at this point, both name & str reference the same String object's address (Bill Hicks)
		
		System.out.println("\nback in the main() method, name is still " + name);
	}
	
	public static void changeName(String str) {
		str = "George Carlin"; // at this point, str references the address of a different String instance (George Carlin, not Bill Hicks anymore)
		
		System.out.println("\n\tin the changeName() method, the str parameter variable is " + str);
	}
}
