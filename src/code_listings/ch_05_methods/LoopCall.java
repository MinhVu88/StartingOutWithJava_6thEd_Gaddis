package code_listings.ch_05_methods;

public class LoopCall {
	public static void main(String[] args) {
		System.out.println("this's from the main() method");
		
		for(int count = 0; count < 5; count++) {
			displayMessage(); // place the call to the displayMessage() method inside a for loop
		}
		
		System.out.println("the main() method says hi again");
	}
	
	public static void displayMessage() {
		System.out.println("\tthis's from the displayMessage() method, printed 5 times using a for loop specified within the main() method");
	}
}
