package code_listings.ch_10_inheritance;

/* This program demonstrates the methods in the SuperClass3 & SubClass3 classes
 * 
 * although there are 4 showValue methods in these 2 classes, only 3 of them can be called from a SubClass3 object
 * */

public class ShowValueDemo {

	public static void main(String[] args) {
		SubClass3 instance = new SubClass3();
		
		// when an int is passed to showValue(), SubClass3's version of the method is called as it overrides SuperClass3's method
		// to call SuperClass3's overridden version of showValue(), the super keyword must be used in SubClass3's showValue()
		instance.showValue(7);
		
		instance.showValue(23.51);
		
		instance.showValue("i will never give up & will prevail over hardship");
	}

}
