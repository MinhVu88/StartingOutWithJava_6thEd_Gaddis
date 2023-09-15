package code_listings.ch_05_methods;

public class SimpleMethod {
    public static void main(String[] args) {
    	System.out.println("this's from the main() method");
    	
    	displayMessage(); // the displayMessage() method is called/invoked
    	
    	System.out.println("back to the main() method");
    }
    
    public static void displayMessage() {
    	System.out.println("\tthis's from the displayMessage() method, which is called/invoked inside the main() method");
    }
}
