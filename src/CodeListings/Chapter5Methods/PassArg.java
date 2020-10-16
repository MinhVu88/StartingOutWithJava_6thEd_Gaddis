package CodeListings.Chapter5Methods;

public class PassArg {
	public static void main(String[] args) {
		int x = 7;
		
		System.out.println("values are passed to the displayValues() method as arguments");
		displayValues(x);
		displayValues(13);
		displayValues(x * 51);
		
		// the Integer.parseInt() method is called 1st & then returns a value. That value is then passed to the displayValues() method as an argument
		displayValues(Integer.parseInt("365"));
		
		System.out.println("\nback to the main() method");
	}
	
	public static void displayValues(int value) {
		System.out.println("\n\tthe value received thru the parameter specified in the displayValues() method signature is " + value);
	}
}
