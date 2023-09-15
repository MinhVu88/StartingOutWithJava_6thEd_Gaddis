package code_listings.ch_10_inheritance;

public class SubClass3 extends SuperClass3 {
	// this method overrides a method in SuperClass3
	@Override
	public void showValue(int arg) {
		System.out.println("\nthe int argument in SubClass3: " + arg);
	}
	
	/**
	 * this method overloads a method in SuperClass3
	 * @param arg
	 */
	public void showValue(double arg) {
		System.out.println("\nthe double argument in SubClass3: " + arg);
	}
}
