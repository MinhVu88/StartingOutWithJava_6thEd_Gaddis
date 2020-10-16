package CodeListings.Chapter5Methods;

// this program demonstrates that only a copy of an argument is passed into a method  

public class PassByValue {
	public static void main(String[] args) {
		int number = 7;
		
		System.out.println("\nbefore the changeMe() method call, the number variable, which is specified in the main() method, is " + number);
		
		// no serves as an argument in the changeMe() method call 
		// a copy of its value is passed into the method's parameter variable
		changeMe(number);
		
		System.out.println("\nafter invoking the changeMe() method, number is still " + number);
	}
	
	public static void changeMe(int myValue) {
		// myValue is a parameter variable which is totally separate & distinct from the argument (no) listed within the changeMe() method call
		// that's why if a parameter variable (myValue) is changed inside a method, it has no effect on the argument specified in the method call (no)
		myValue = 13;
		System.out.println("\n\tmyValue is " + myValue + ", as initialized in the changeMe() method, regardless of the argument's value in the method call in the main() method");
	}
}
