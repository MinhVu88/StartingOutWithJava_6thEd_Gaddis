package CodeListings.Chapter10Inheritance;

public class SuperClass3 {
	/**
	 * overloaded method #1
	 * @param arg
	 */
	public void showValue(int arg) {
		System.out.println("\nthe int argument in SuperClass3: " + arg);
	}
	
	/**
	 * overloaded method #2
	 * @param arg
	 */
	public void showValue(String arg) {
		System.out.println("\nthe String argument in SuperClass3: " + arg);
	}
}
